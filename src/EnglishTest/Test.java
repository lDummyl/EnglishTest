package EnglishTest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;


class Test {

    Vocabulary words = new Vocabulary();
    List<Map.Entry<String, String>> wordsList = new ArrayList<>(words.WordsAugust19().entrySet());

    List<String> englWords = wordsList.stream().map(Map.Entry::getValue).collect(Collectors.toList());  //список англ слов
    //List<String> rusWords = words2.stream().map(Map.Entry::getKey).collect(Collectors.toList());

    HashMap<String, String> mistakes = new HashMap<String, String>();

    int balls = 0;  //счетчик правильных ответов
    int count = 0;  //счетчик английских слов (или кол-во слов в тесте)
    private int number = englWords.size(); //оличество слов в тесте


    void Test1()throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean b = true;

        Collections.shuffle(englWords);   //перемешиваем список

      //   words2.forEach(i -> words1.Words().put(words1.Words().get(i), words1.Words().get(i)));

        System.out.println("Вы готовы к начать тестирование?");
        String с = reader.readLine();

        System.out.println("Выполните перевод: ");

        while(b) {   //прогоняем слова из списка englWord
            for (Map.Entry<String, String> pair : words.WordsAugust19().entrySet()) {  //прогоняем слова из мапы this.words.WordsAugust19()
                if(englWords.get(count).equals(pair.getValue())) {
                    System.out.print(englWords.get(count) + " - ");

                    String s = reader.readLine();
                    if (s.equals(pair.getKey())) {
                        System.out.println("\u001B[32m" + " + " + "\u001B[30m");
                        balls++;
                        break;
                    }
                    else {
                        System.out.println("\u001B[31m" + "Ошибка! Правильный перевод: - " + pair.getKey() + "\u001B[30m");
                    //    mistakes.put(pair.getValue(), pair.getKey());            //показать ошибки после теста
                        break;
                    }
                }
            }
            count++;
            if((count) == number)   //если весь список пройден, заканчиваем
                b = false;
        }
    }

}
