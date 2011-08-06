package jp.scoresheet.service.score;

import java.util.Date;
import java.util.List;

import jp.scoresheet.model.score.Exam;
import jp.scoresheet.model.score.ScoreHistory;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreServiceTest extends AppEngineTestCase {

    private ScoreService service = new ScoreService();

    @Test
    public void scoreTest1() throws Exception {

        // 初回は0件であること
        List<Exam> examList = service.getAll();
        // ===== assertion start =====
        // 初回は0件であること
        assertNotNull(examList);
        assertTrue(examList.isEmpty());
        // ===== assertion end   =====
        
        // ===========================
        // 問題の新規登録
        // ===========================
        // 問題の作成(1回目は判定：T)
        /** Exam **/
        Exam exam = new Exam();
        exam.setChapterNo(2);
        exam.setQuestionNo(10);
        exam.setCurrentDate(new Date());
        exam.setWeight(true);
        // データストアへ更新
        /** ScoreHistory **/
        ScoreHistory scoreHistory = new ScoreHistory();
        scoreHistory.setJudge(1);
        scoreHistory.setScoreDate(exam.getCurrentDate());
        // データストアへ更新
        service.insert(exam, scoreHistory);
        // 更新後の問題一覧の取得
        examList = service.getAll();
        // ===== assertion start =====
        // 更新後の問題一覧は1件であること
        assertNotNull(examList);
        assertTrue(examList.size() == 1);
        // 1件の中身のチェック
        Exam storedExam = examList.get(0);
        assertNotNull(storedExam);
        // 新規作成したExamと、登録後再取得したExamが等しいこと
        assertEqualExam(exam, storedExam);
        // 新規作成したStoredHistoryと、登録後再取得したStoredHistoryが等しいこと
        List<ScoreHistory> storedShList = storedExam.getScoreHistoryRef().getModelList();
        // スコア履歴が1件であること
        assertNotNull(storedShList);
        assertTrue(storedShList.size() == 1);
        // 1件の中身チェック
        ScoreHistory storedSh = storedShList.get(0);
        // 新規作成したScoreHistoryと、登録後再取得したScoreHistoryが等しいこと
        assertEqualSh(scoreHistory, storedSh);
        // 登録後のバージョンが1であること
        assertEquals(storedExam.getVersion(), Long.valueOf(1L));
        // ===== assertion end   =====
        
        // ===========================
        // 問題の一件取得
        // ===========================
        // 一覧から一つの問題が選択された想定で再取得
        storedExam = service.get(storedExam.getKey());
        // ===== assertion start =====
        // 指定されたKeyの問題が取得されていること
        assertNotNull(storedExam);
        // 先に登録したExamであること
        assertEqualExam(exam, storedExam);
        // 登録後のVersionが1であること
        assertEquals(storedExam.getVersion(), Long.valueOf(1L));
        // ===== assertion end   =====
        
        // スコア履歴一覧の再取得
        storedShList = storedExam.getScoreHistoryRef().getModelList();
        // ===== assertion start =====
        // 1件のスコア履歴が登録されていること
        assertNotNull(storedShList);
        assertTrue(storedShList.size() == 1);
        // 1件の中身のチェック
        storedSh = storedShList.get(0);
        assertEqualSh(scoreHistory, storedSh);
        // 主キーであるIDが1であること
        assertEquals(storedSh.getKey().getId(), 1L);
        
        // スコア履歴件数
        assertTrue(storedExam.getCurrenctScoreHistoryId() == 1L);
        // 最終登録日付がスコア履歴日付と同じ
        assertEquals(storedExam.getCurrentDate(), storedSh.getScoreDate());
        // Examの累積カウントがいずれも1であること
        assertEquals(storedExam.getAccumulateCnt(), Long.valueOf(1L));
        assertEquals(storedExam.getAccumulateCorrectCnt(), Long.valueOf(1L));
        // ===== assertion end   =====
        
        // ===========================
        // 問題の上書き更新
        // ===========================
        // 問題の変更(weightのみ?)
        storedExam.setWeight(false);
        // スコア履歴の変更
        storedShList = storedExam.getScoreHistoryRef().getModelList();
        storedSh = storedShList.get(0);
        storedSh.setJudge(0);
    }
    
    private void assertEqualSh(ScoreHistory sh1, ScoreHistory sh2) {
        // ともにNullではないこと
        assertNotNull(sh1);
        assertNotNull(sh2);
        // 各プロパティが等しいこと
        assertEquals(sh1.getJudge(), sh2.getJudge());
        assertEquals(sh1.getScoreDate(), sh2.getScoreDate());
    }

    private void assertEqualExam(Exam exam1, Exam exam2) {
        // ともにNullではないこと
        assertNotNull(exam1);
        assertNotNull(exam2);
        // 各プロパティが等しいこと
        assertEquals(exam1.getChapterNo(), exam2.getChapterNo());
        assertEquals(exam1.getQuestionNo(), exam2.getQuestionNo());
        assertEquals(exam1.getAccumulateCnt(), exam2.getAccumulateCnt());
        assertEquals(exam1.getAccumulateCorrectCnt(), exam2.getAccumulateCorrectCnt());
        assertEquals(exam1.getCurrenctScoreHistoryId(), exam2.getCurrenctScoreHistoryId());
        assertEquals(exam1.getCurrentDate(), exam2.getCurrentDate());
        assertEquals(exam1.getWeight(), exam2.getWeight());
    }
}
