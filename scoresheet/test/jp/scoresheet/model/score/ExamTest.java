package jp.scoresheet.model.score;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ExamTest extends AppEngineTestCase {

    private Exam model = new Exam();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
