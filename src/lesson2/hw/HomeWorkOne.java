package lesson2.hw;

/**
 * Задача 1. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?
 * Задача 2. Дано: Стороны квадрата a = 50, b = 20. Найти площадь.
 * Задача 3. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
 *  насколько быстрее голодный Вася съедает один банан?
 * Задача 4. Закомментируй часть кода, чтобы на экран вывелось сообщение "sum = 12"
 * Задача 5. В методе main расставь правильно знаки плюс и минус, чтобы значение переменной result получилось равным 20.
 *  Знаки нужно расставить только в строчке, в которой объявляется переменная result.
 *  Порядок следования переменных в этой строке изменять нельзя.
 *  Перед каждой переменной должен стоять знак либо плюс, либо минус.
 */

public class HomeWorkOne {

    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;


    public static void main(String[] args) {

        //1.
//        double cash = 5d;
//        double cashbox1 = cash / 2;
//        double cashbox2 = cash - cashbox1;
//
//        System.out.println("Fisrst cashbox: " + cashbox1 + "\n" + "Second cashbox: " + cashbox2);
        //=====================================================================================================//

//        //2.
//        int sideA = 50;
//        int sideB = 20;
//        int square = sideA * sideB;
//        System.out.println("Площадь: " + square);
        //=====================================================================================================//

        //3.
//        int bananas = 3;
//        int hungryTime = 9;
//        int bellyfulTime = 15;
//        int oneBananHungry = hungryTime / bananas;
//        int oneBananBellyful = bellyfulTime / bananas;
//        int difference = oneBananBellyful - oneBananHungry;
//        System.out.println("Голодный Вася съедает быстрее один банан на: " + difference);
        //=====================================================================================================//

        //4.
//        int a = 3;
//       ///////// int a = 10;
//        int b = 6;
//        ////////int b = 12;
//        ////////int sum = 1 + a + b;
//        ////////int sum = 2 + a + b;
//        int sum = 3 + a + b;
//        ////////int sum = 4 + a + b;
//        System.out.println("sum = " + sum);
        //===================================================================================================//

        //5.
          int result = - a + b - c + d;

          System.out.println(result);


    }
}
