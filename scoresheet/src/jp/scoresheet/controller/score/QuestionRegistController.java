package jp.scoresheet.controller.score;

import org.slim3.controller.Controller;
import org.slim3.controller.Navigation;

public class QuestionRegistController extends Controller {

    @Override
    public Navigation run() throws Exception {
        return forward("QuestionRegist.jsp");
    }
}
