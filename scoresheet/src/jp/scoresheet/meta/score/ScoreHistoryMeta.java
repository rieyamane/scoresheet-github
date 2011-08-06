package jp.scoresheet.meta.score;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-08-04 20:44:45")
/** */
public final class ScoreHistoryMeta extends org.slim3.datastore.ModelMeta<jp.scoresheet.model.score.ScoreHistory> {

    /** */
    public final org.slim3.datastore.ModelRefAttributeMeta<jp.scoresheet.model.score.ScoreHistory, org.slim3.datastore.ModelRef<jp.scoresheet.model.score.Exam>, jp.scoresheet.model.score.Exam> examRef = new org.slim3.datastore.ModelRefAttributeMeta<jp.scoresheet.model.score.ScoreHistory, org.slim3.datastore.ModelRef<jp.scoresheet.model.score.Exam>, jp.scoresheet.model.score.Exam>(this, "examRef", "examRef", org.slim3.datastore.ModelRef.class, jp.scoresheet.model.score.Exam.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.ScoreHistory, java.lang.Integer> judge = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.ScoreHistory, java.lang.Integer>(this, "judge", "judge", java.lang.Integer.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.ScoreHistory, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.ScoreHistory, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.ScoreHistory, java.util.Date> scoreDate = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.ScoreHistory, java.util.Date>(this, "scoreDate", "scoreDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.ScoreHistory, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.ScoreHistory, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final ScoreHistoryMeta slim3_singleton = new ScoreHistoryMeta();

    /**
     * @return the singleton
     */
    public static ScoreHistoryMeta get() {
       return slim3_singleton;
    }

    /** */
    public ScoreHistoryMeta() {
        super("ScoreHistory", jp.scoresheet.model.score.ScoreHistory.class);
    }

    @Override
    public jp.scoresheet.model.score.ScoreHistory entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.scoresheet.model.score.ScoreHistory model = new jp.scoresheet.model.score.ScoreHistory();
        if (model.getExamRef() == null) {
            throw new NullPointerException("The property(examRef) is null.");
        }
        model.getExamRef().setKey((com.google.appengine.api.datastore.Key) entity.getProperty("examRef"));
        model.setJudge(longToInteger((java.lang.Long) entity.getProperty("judge")));
        model.setKey(entity.getKey());
        model.setScoreDate((java.util.Date) entity.getProperty("scoreDate"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.scoresheet.model.score.ScoreHistory m = (jp.scoresheet.model.score.ScoreHistory) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        if (m.getExamRef() == null) {
            throw new NullPointerException("The property(examRef) must not be null.");
        }
        entity.setProperty("examRef", m.getExamRef().getKey());
        entity.setProperty("judge", m.getJudge());
        entity.setProperty("scoreDate", m.getScoreDate());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.scoresheet.model.score.ScoreHistory m = (jp.scoresheet.model.score.ScoreHistory) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.scoresheet.model.score.ScoreHistory m = (jp.scoresheet.model.score.ScoreHistory) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.scoresheet.model.score.ScoreHistory m = (jp.scoresheet.model.score.ScoreHistory) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
        jp.scoresheet.model.score.ScoreHistory m = (jp.scoresheet.model.score.ScoreHistory) model;
        if (m.getExamRef() == null) {
            throw new NullPointerException("The property(examRef) must not be null.");
        }
        m.getExamRef().assignKeyIfNecessary(ds);
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.scoresheet.model.score.ScoreHistory m = (jp.scoresheet.model.score.ScoreHistory) model;
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
        jp.scoresheet.model.score.ScoreHistory m = (jp.scoresheet.model.score.ScoreHistory) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getExamRef() != null && m.getExamRef().getKey() != null){
            writer.setNextPropertyName("examRef");
            encoder0.encode(writer, m.getExamRef(), maxDepth, currentDepth);
        }
        if(m.getJudge() != null){
            writer.setNextPropertyName("judge");
            encoder0.encode(writer, m.getJudge());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getScoreDate() != null){
            writer.setNextPropertyName("scoreDate");
            encoder0.encode(writer, m.getScoreDate());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.scoresheet.model.score.ScoreHistory jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.scoresheet.model.score.ScoreHistory m = new jp.scoresheet.model.score.ScoreHistory();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("examRef");
        decoder0.decode(reader, m.getExamRef(), maxDepth, currentDepth);
        reader = rootReader.newObjectReader("judge");
        m.setJudge(decoder0.decode(reader, m.getJudge()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("scoreDate");
        m.setScoreDate(decoder0.decode(reader, m.getScoreDate()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}