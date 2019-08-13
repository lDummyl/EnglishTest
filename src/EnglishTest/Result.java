package EnglishTest;

import java.util.Map;

class Result {

    int balls;
    int count;
    Test test;


     void ShowResult(int balls, int count, Test test){
        this.balls = balls;
        this.count = count;
        this.test = test;

        System.out.println("Вы правильно перевели " + this.balls + " слов(а) из " + this.count);
        if(this.balls == this.count)
            System.out.println("\u001B[35m" + "Без единой ошибки! Это отлично! Тест пройден." + "\u001B[30m");

        if(this.balls >= (this.count*0.8) && this.balls < this.count)
            System.out.println("\u001B[35m" + "Это хороший результат! Вы молодец! Тест пройден." + "\u001B[30m");

        if(this.balls >= (this.count*0.6) && this.balls < (this.count*0.8))
            System.out.println("\u001B[35m" + "Это неплохой результат. Но надо потренироваться еще. Тест не пройден" + "\u001B[30m");

        if(this.balls >= (this.count*0.4) && this.balls < (this.count*0.6))
            System.out.println("\u001B[35m" + "Результат средний. Подготовьтесь получше. Тест не пройден" + "\u001B[30m");

        if(this.balls >= (this.count*0.2) && this.balls < (this.count*0.4))
            System.out.println("\u001B[35m" + "Очень слабенько... Тест не пройден" + "\u001B[30m");

        if(this.balls >= (0) && this.balls < (this.count*0.2))
            System.out.println("\u001B[35m" + "Вы вообще учили слова? Тест не пройден." + "\u001B[30m");

       // test.mistakes.forEach(i-> System.out.println(i));

      /*   if(!test.mistakes.isEmpty()) {                //показывать ошибки после теста
             System.out.println("Ваши ошибки: ");
             for (Map.Entry entry : test.mistakes.entrySet())
                 System.out.println(entry);
         }

       */

    }

}
