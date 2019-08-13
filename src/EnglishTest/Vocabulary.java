package EnglishTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Vocabulary {
    HashMap<String, String> words = new HashMap<>();  //слова на август
    List<String> tipList = new ArrayList<>();

    Vocabulary() {
    }

    HashMap<String, String> WordsAugust19(){     //словарь на август 2019

  //      words.put("счастье", "happy");
  //      words.put("слово", "word");
  //      words.put("знакомство", "acquaintance");
  //      words.put("фамильярность", "familiarity");
        words.put("вилка", "fork");
        words.put("правило", "rule");
        words.put("сосед", "neighbor");
        words.put("конкурент", "competitor");
  //      words.put("скучно", "bored");
  //      words.put("скучный", "boring");    //10
  //      words.put("зарубеж", "abroad");
        words.put("отлично", "excellent");
  //      words.put("блестяще", "brilliant");
  //      words.put("тесть", "father-in-law");
        words.put("племянник", "nephew");
  //     words.put("независимый", "independent");
        words.put("связь", "relation");
        words.put("хозяин", "host");
        words.put("обзор", "review");
        words.put("медсестра", "nurse");  //20
        words.put("официант", "waiter");
        words.put("вход", "entrance");
        words.put("двор", "yard");
        words.put("важный", "important");
  //      words.put("неважный", "unimportant");
  //      words.put("забор", "fence");
        words.put("земля", "land");
        words.put("зависит", "depends");
        words.put("доступ", "access");
        words.put("завод", "factory");    //30
  //      words.put("перекресток", "crossroads");
        words.put("упражнение", "exercise");
        words.put("применять", "apply");
        words.put("путь", "path");
  //      words.put("поле", "field");
        words.put("образование", "education");
        words.put("изобретение", "invention");
        words.put("граница", "border");
  //      words.put("таможня", "customs"); //39

        return words;
    }

    void TipAugust19(){
        tipList = Arrays.asList("знакомство", "фамильярность", "зарубеж", "блестяще", "независимый",
                "важный", "земля", "зависит", "завод", "путь", "применять");

        System.out.println("Подсказка, для точности ответов: " + tipList);
    }
}
