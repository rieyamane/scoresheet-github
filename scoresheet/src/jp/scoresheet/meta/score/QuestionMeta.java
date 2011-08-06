package jp.scoresheet.meta.score;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-08-04 20:44:45")
/** */
public final class QuestionMeta extends org.slim3.datastore.ModelMeta<jp.scoresheet.model.score.Question> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.lang.Long> accumCount = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.lang.Long>(this, "accumCount", "accumCount", java.lang.Long.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.lang.Integer> chapterNo = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.lang.Integer>(this, "chapterNo", "chapterNo", java.lang.Integer.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.lang.Long> count = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.lang.Long>(this, "count", "count", java.lang.Long.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.util.Date> currentDate = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.util.Date>(this, "currentDate", "currentDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.lang.Integer> examNo = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.lang.Integer>(this, "examNo", "examNo", java.lang.Integer.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.lang.Boolean> important = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.lang.Boolean>(this, "important", "important", java.lang.Boolean.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.lang.Boolean> judge = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.lang.Boolean>(this, "judge", "judge", java.lang.Boolean.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<jp.scoresheet.model.score.Question, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final QuestionMeta slim3_singleton = new QuestionMeta();

    /**
     * @return the singleton
     */
    public static QuestionMeta get() {
       return slim3_singleton;
    }

    /** */
    public QuestionMeta() {
        super("Question", jp.scoresheet.model.score.Question.class);
    }

    @Override
    public jp.scoresheet.model.score.Question entityToModel(com.google.appengine.api.datastore.Entity entity) {
        jp.scoresheet.model.score.Question model = new jp.scoresheet.model.score.Question();
        model.setAccumCount((java.lang.Long) entity.getProperty("accumCount"));
        model.setChapterNo(longToInteger((java.lang.Long) entity.getProperty("chapterNo")));
        model.setCount((java.lang.Long) entity.getProperty("count"));
        model.setCurrentDate((java.util.Date) entity.getProperty("currentDate"));
        model.setExamNo(longToInteger((java.lang.Long) entity.getProperty("examNo")));
        model.setImportant((java.lang.Boolean) entity.getProperty("important"));
        model.setJudge((java.lang.Boolean) entity.getProperty("judge"));
        model.setKey(entity.getKey());
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        jp.scoresheet.model.score.Question m = (jp.scoresheet.model.score.Question) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("accumCount", m.getAccumCount());
        entity.setProperty("chapterNo", m.getChapterNo());
        entity.setProperty("count", m.getCount());
        entity.setProperty("currentDate", m.getCurrentDate());
        entity.setProperty("examNo", m.getExamNo());
        entity.setProperty("important", m.getImportant());
        entity.setProperty("judge", m.getJudge());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        jp.scoresheet.model.score.Question m = (jp.scoresheet.model.score.Question) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        jp.scoresheet.model.score.Question m = (jp.scoresheet.model.score.Question) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        jp.scoresheet.model.score.Question m = (jp.scoresheet.model.score.Question) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        jp.scoresheet.model.score.Question m = (jp.scoresheet.model.score.Question) model;
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
        jp.scoresheet.model.score.Question m = (jp.scoresheet.model.score.Question) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getAccumCount() != null){
            writer.setNextPropertyName("accumCount");
            encoder0.encode(writer, m.getAccumCount());
        }
        if(m.getChapterNo() != null){
            writer.setNextPropertyName("chapterNo");
            encoder0.encode(writer, m.getChapterNo());
        }
        if(m.getCount() != null){
            writer.setNextPropertyName("count");
            encoder0.encode(writer, m.getCount());
        }
        if(m.getCurrentDate() != null){
            writer.setNextPropertyName("currentDate");
            encoder0.encode(writer, m.getCurrentDate());
        }
        if(m.getExamNo() != null){
            writer.setNextPropertyName("examNo");
            encoder0.encode(writer, m.getExamNo());
        }
        if(m.getImportant() != null){
            writer.setNextPropertyName("important");
            encoder0.encode(writer, m.getImportant());
        }
        if(m.getJudge() != null){
            writer.setNextPropertyName("judge");
            encoder0.encode(writer, m.getJudge());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected jp.scoresheet.model.score.Question jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        jp.scoresheet.model.score.Question m = new jp.scoresheet.model.score.Question();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("accumCount");
        m.setAccumCount(decoder0.decode(reader, m.getAccumCount()));
        reader = rootReader.newObjectReader("chapterNo");
        m.setChapterNo(decoder0.decode(reader, m.getChapterNo()));
        reader = rootReader.newObjectReader("count");
        m.setCount(decoder0.decode(reader, m.getCount()));
        reader = rootReader.newObjectReader("currentDate");
        m.setCurrentDate(decoder0.decode(reader, m.getCurrentDate()));
        reader = rootReader.newObjectReader("examNo");
        m.setExamNo(decoder0.decode(reader, m.getExamNo()));
        reader = rootReader.newObjectReader("important");
        m.setImportant(decoder0.decode(reader, m.getImportant()));
        reader = rootReader.newObjectReader("judge");
        m.setJudge(decoder0.decode(reader, m.getJudge()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}