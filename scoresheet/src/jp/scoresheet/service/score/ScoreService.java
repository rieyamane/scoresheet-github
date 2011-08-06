package jp.scoresheet.service.score;

import java.util.List;

import org.slim3.datastore.Datastore;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Transaction;

import jp.scoresheet.meta.score.ExamMeta;
import jp.scoresheet.meta.score.ScoreHistoryMeta;
import jp.scoresheet.model.score.Exam;
import jp.scoresheet.model.score.ScoreHistory;


public class ScoreService {

    public List<Exam> getAll() {
        // 全件取得(chapterNo,questionNoの昇順)
        ExamMeta m = ExamMeta.get();
        return Datastore.query(m).sort(m.chapterNo.asc, m.questionNo.asc).asList();
    }
    
    public Exam get(Key key) {
        // Keyと合致する問題を一件取得
        return Datastore.getOrNull(ExamMeta.get(), key);
    }

    public void delete(Key key) throws Exception {
        Transaction tx = Datastore.beginTransaction();
        try {
            Datastore.delete(tx, key);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            throw e;
        }
    }

    /**
     * Exam & ScoreHistoryレコードを新規登録
     * (Examが既にあればUpdate)
     * @param exam
     * @param scoreHistory
     * @throws Exception
     */
    public void insert(Exam exam, ScoreHistory scoreHistory) throws Exception {
        if (exam.getKey() == null) {
            exam.setKey(Datastore.allocateId(ExamMeta.get()));
        }
        long newShId = exam.getCurrenctScoreHistoryId() + 1L;
        Key shKey = Datastore.createKey(exam.getKey(), ScoreHistoryMeta.get(), newShId);
        scoreHistory.setKey(shKey);
        scoreHistory.getExamRef().setModel(exam);
        exam.setCurrenctScoreHistoryId(newShId);
        exam.setAccumulateCnt(exam.getAccumulateCnt()+1);
        if (scoreHistory.getJudge() == 1) {
            exam.setAccumulateCorrectCnt(exam.getAccumulateCorrectCnt()+1);
        }
        Transaction tx = Datastore.beginTransaction();
        try {
            Datastore.put(tx, exam, scoreHistory);
            tx.commit();
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            throw e;
        }
        
    }
}
