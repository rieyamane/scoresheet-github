package jp.scoresheet.model.score;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ScoreHistoryTest extends AppEngineTestCase {

    private ScoreHistory model = new ScoreHistory();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
