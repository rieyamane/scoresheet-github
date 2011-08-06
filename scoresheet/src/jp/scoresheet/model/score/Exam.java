package jp.scoresheet.model.score;

import java.io.Serializable;
import java.util.Date;

import jp.scoresheet.meta.score.ScoreHistoryMeta;

import com.google.appengine.api.datastore.Key;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.InverseModelListRef;
import org.slim3.datastore.Model;

@Model(schemaVersion = 1)
public class Exam implements Serializable {

    private static final long serialVersionUID = 1L;

    @Attribute(primaryKey = true)
    private Key key;

    @Attribute(version = true)
    private Long version;

    // 章No
    private Integer chapterNo;
    // 問題No
    private Integer questionNo;
    // 累積回数
    private Long accumulateCnt = 0L;
    // 累積正解回数
    private Long accumulateCorrectCnt = 0L;
    // 最新日付
    private Date currentDate;
    // 最新スコア履歴Id
    private Long currenctScoreHistoryId = 0L;
    // ウェイト
    private Boolean weight = false;
    // ScoreHistoryへの1対多の関連
    @Attribute(persistent=false)
    private InverseModelListRef<ScoreHistory, Exam> scoreHistoryRef = 
        new InverseModelListRef<ScoreHistory, Exam>(ScoreHistory.class, ScoreHistoryMeta.get().examRef, this);
    /**
     * Returns the key.
     *
     * @return the key
     */
    public Key getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key
     *            the key
     */
    public void setKey(Key key) {
        this.key = key;
    }

    /**
     * Returns the version.
     *
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version
     *            the version
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    public Integer getChapterNo() {
        return chapterNo;
    }

    public void setChapterNo(Integer chapterNo) {
        this.chapterNo = chapterNo;
    }

    public Integer getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(Integer questionNo) {
        this.questionNo = questionNo;
    }

    public Long getAccumulateCnt() {
        return accumulateCnt;
    }

    public void setAccumulateCnt(Long accumulateCnt) {
        this.accumulateCnt = accumulateCnt;
    }

    public Long getAccumulateCorrectCnt() {
        return accumulateCorrectCnt;
    }

    public void setAccumulateCorrectCnt(Long accumulateCorrectCnt) {
        this.accumulateCorrectCnt = accumulateCorrectCnt;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Boolean getWeight() {
        return weight;
    }

    public void setWeight(Boolean weight) {
        this.weight = weight;
    }

    
    public Long getCurrenctScoreHistoryId() {
        return currenctScoreHistoryId;
    }

    public void setCurrenctScoreHistoryId(Long currenctScoreHistoryId) {
        this.currenctScoreHistoryId = currenctScoreHistoryId;
    }

    public InverseModelListRef<ScoreHistory, Exam> getScoreHistoryRef() {
        return scoreHistoryRef;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Exam other = (Exam) obj;
        if (key == null) {
            if (other.key != null) {
                return false;
            }
        } else if (!key.equals(other.key)) {
            return false;
        }
        return true;
    }
}
