package EnglishTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Test {

	Vocabulary vocabulary = new Vocabulary();
	Collection<Map.Entry<String, String>> wordsList = vocabulary.words.entrySet();
//    List<String> englWords = wordsList.stream().map(Map.Entry::getValue).collect(Collectors.toList());  //список англ слов

	// TODO: 8/13/19 можно и проще да и без листа по хорошему бы
	List<String> englWords = new ArrayList<>(vocabulary.words.values());
	//List<String> rusWords = words2.stream().map(Map.Entry::getKey).collect(Collectors.toList());

	HashMap<String, String> mistakes = new HashMap<String, String>();

	int balls = 0;  //счетчик правильных ответов
	int count = 0;  //счетчик английских слов (или кол-во слов в тесте)


	void Test1() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean b = true;

		// TODO: 8/13/19 лучше добывать рандомные объекты из коллекции чем мешать ее, стоит начинать думать о перфомансе даже там где это не явно выражено.
		Collections.shuffle(englWords);   //перемешиваем список

		//   words2.forEach(i -> words1.Words().put(words1.Words().get(i), words1.Words().get(i)));

		System.out.println("Вы готовы к начать тестирование?");
		String с = reader.readLine();

		System.out.println("Выполните перевод: ");

		boolean testFinished = false;
		while (!testFinished) {   //прогоняем слова из списка englWord
			for (Map.Entry<String, String> pair : vocabulary.words.entrySet()) {  //прогоняем слова из мапы this.words.WordsAugust19()
				if (englWords.get(count).equals(pair.getValue())) {
					System.out.print(englWords.get(count) + " - ");
					// TODO: 8/14/19 опять ввод намешан с выводом и логикой.
					String s = reader.readLine();
					if (s.equals(pair.getKey())) {
						System.out.println("\u001B[32m" + " + " + "\u001B[30m");
						balls++;
						break;
					} else {
						System.out.println("\u001B[31m" + "Ошибка! Правильный перевод: - " + pair.getKey() + "\u001B[30m");
						//    mistakes.put(pair.getValue(), pair.getKey());            //показать ошибки после теста
						break;
					}
				}
			}
			count++;
			// TODO: 8/14/19 если код самодокументирован то комментарии не нужны
			testFinished = count == englWords.size();
		}
	}
}
