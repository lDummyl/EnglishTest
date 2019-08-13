package EnglishTest;

import java.util.ArrayList;
import java.util.HashMap;

public class TestMain {
    public static void main(String[] args)throws Exception {

        Vocabulary vocabulary = new Vocabulary();
        Test test01 = new Test();
        Result result = new Result();

        vocabulary.TipAugust19();                           //подсказки
        test01.Test1();                                        //тест
        result.ShowResult(test01.balls, test01.count, test01);    //результат

    }
}
