package jp.scoresheet.meta.score;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-08-04 20:44:45")
/** */
public final class ExamMeta extends org.slim3.datastore.ModelMeta<jp.scoresheet.model.score.Exam> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.lang.Long> accumulateCnt = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.lang.Long>(this, "accumulateCnt", "accumulateCnt", java.lang.Long.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.lang.Long> accumulateCorrectCnt = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.lang.Long>(this, "accumulateCorrectCnt", "accumulateCorrectCnt", java.lang.Long.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.lang.Integer> chapterNo = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.lang.Integer>(this, "chapterNo", "chapterNo", java.lang.Integer.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.lang.Long> currenctScoreHistoryId = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.lang.Long>(this, "currenctScoreHistoryId", "currenctScoreHistoryId", java.lang.Long.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.util.Date> currentDate = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.util.Date>(this, "currentDate", "currentDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.lang.Integer> questionNo = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.lang.Integer>(this, "questionNo", "questionNo", java.lang.Integer.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.lang.Boolean> weight = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Exam, java.lang.Boolean>(this, "weight", "weight", java.lang.Boolean.class);

    private static final ExamMeta slim3_singleton = new ExamMeta();

    /**
     * @return the singleton
     */
    public static ExamMeta get() {
       return slim3_singleton;
    }

    /** */
    public ExamMeta() {
        super("Exam", jp.scoresheet.model.score.Exam.class);
    }

    @Override
    public jp.scoresheet.model.score.Exam entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.scoresheet.model.score.Exam model = new jp.scoresheet.model.score.Exam();
        model.setAccumulateCnt((java.lang.Long) entity.getProperty("accumulateCnt"));
        model.setAccumulateCorrectCnt((java.lang.Long) entity.getProperty("accumulateCorrectCnt"));
        model.setChapterNo(longToInteger((java.lang.Long) entity.getProperty("chapterNo")));
        model.setCurrenctScoreHistoryId((java.lang.Long) entity.getProperty("currenctScoreHistoryId"));
        model.setCurrentDate((java.util.Date) entity.getProperty("currentDate"));
        model.setKey(entity.getKey());
        model.setQuestionNo(longToInteger((java.lang.Long) entity.getProperty("questionNo")));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        model.setWeight((java.lang.Boolean) entity.getProperty("weight"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.scoresheet.model.score.Exam m = (jp.scoresheet.model.score.Exam) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("accumulateCnt", m.getAccumulateCnt());
        entity.setProperty("accumulateCorrectCnt", m.getAccumulateCorrectCnt());
        entity.setProperty("chapterNo", m.getChapterNo());
        entity.setProperty("currenctScoreHistoryId", m.getCurrenctScoreHistoryId());
        entity.setProperty("currentDate", m.getCurrentDate());
        entity.setProperty("questionNo", m.getQuestionNo());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("weight", m.getWeight());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.scoresheet.model.score.Exam m = (jp.scoresheet.model.score.Exam) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.scoresheet.model.score.Exam m = (jp.scoresheet.model.score.Exam) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.scoresheet.model.score.Exam m = (jp.scoresheet.model.score.Exam) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.scoresheet.model.score.Exam m = (jp.scoresheet.model.score.Exam) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        jp.scoresheet.model.score.Exam m = (jp.scoresheet.model.score.Exam) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getAccumulateCnt() != null){
            writer.setNextPropertyName("accumulateCnt");
            encoder0.encode(writer, m.getAccumulateCnt());
        }
        if(m.getAccumulateCorrectCnt() != null){
            writer.setNextPropertyName("accumulateCorrectCnt");
            encoder0.encode(writer, m.getAccumulateCorrectCnt());
        }
        if(m.getChapterNo() != null){
            writer.setNextPropertyName("chapterNo");
            encoder0.encode(writer, m.getChapterNo());
        }
        if(m.getCurrenctScoreHistoryId() != null){
            writer.setNextPropertyName("currenctScoreHistoryId");
            encoder0.encode(writer, m.getCurrenctScoreHistoryId());
        }
        if(m.getCurrentDate() != null){
            writer.setNextPropertyName("currentDate");
            encoder0.encode(writer, m.getCurrentDate());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getQuestionNo() != null){
            writer.setNextPropertyName("questionNo");
            encoder0.encode(writer, m.getQuestionNo());
        }
        if(m.getScoreHistoryRef() != null){
            writer.setNextPropertyName("scoreHistoryRef");
            encoder0.encode(writer, m.getScoreHistoryRef());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        if(m.getWeight() != null){
            writer.setNextPropertyName("weight");
            encoder0.encode(writer, m.getWeight());
        }
        writer.endObject();
    }

    @Override
    protected jp.scoresheet.model.score.Exam jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.scoresheet.model.score.Exam m = new jp.scoresheet.model.score.Exam();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("accumulateCnt");
        m.setAccumulateCnt(decoder0.decode(reader, m.getAccumulateCnt()));
        reader = rootReader.newObjectReader("accumulateCorrectCnt");
        m.setAccumulateCorrectCnt(decoder0.decode(reader, m.getAccumulateCorrectCnt()));
        reader = rootReader.newObjectReader("chapterNo");
        m.setChapterNo(decoder0.decode(reader, m.getChapterNo()));
        reader = rootReader.newObjectReader("currenctScoreHistoryId");
        m.setCurrenctScoreHistoryId(decoder0.decode(reader, m.getCurrenctScoreHistoryId()));
        reader = rootReader.newObjectReader("currentDate");
        m.setCurrentDate(decoder0.decode(reader, m.getCurrentDate()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("questionNo");
        m.setQuestionNo(decoder0.decode(reader, m.getQuestionNo()));
        reader = rootReader.newObjectReader("scoreHistoryRef");
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        reader = rootReader.newObjectReader("weight");
        m.setWeight(decoder0.decode(reader, m.getWeight()));
        return m;
    }
}