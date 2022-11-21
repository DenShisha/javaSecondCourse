package lesson4.hw;

import java.util.Scanner;

/**
 * 1
 * Ввести с клавиатуры два числа m и n.
 * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
 *
 * Пример: m=2, n=4
 * 8888
 * 8888
 *
 * 2
 * Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
 *
 * Пример вывода на экран:
 * 8
 * 88
 * 888
 * 8888
 * 88888
 * 888888
 * 8888888
 * 88888888
 * 888888888
 * 8888888888
 *
 * 3
 * Ввести с клавиатуры три числа, вывести на экран среднее из них.
 * Т.е. не самое большое и не самое маленькое.
 * Если все числа равны, вывести любое из них.
 *
 * 4
 * Вводить с клавиатуры числа.
 * Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
 * -1 должно учитываться в сумме.
 *
 * Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
 *
 * while (true) {
 *     int number = считываем число;
 *     if (проверяем, что number -1)
 *         break;
 * }
 *
 * 5
 * Вывести на экран таблицу умножения 10х10 используя цикл while.
 * Числа разделить пробелом.
 *
 * Пример вывода на экран:
 * 1 2 3 4 5 6 7 8 9 10
 * 2 4 6 8 10 12 14 16 18 20
 * 3 6 9 12 15 18 21 24 27 30
 * 4 8 12 16 20 24 28 32 36 40
 * 5 10 15 20 25 30 35 40 45 50
 * 6 12 18 24 30 36 42 48 54 60
 * 7 14 21 28 35 42 49 56 63 70
 * 8 16 24 32 40 48 56 64 72 80
 * 9 18 27 36 45 54 63 72 81 90
 * 10 20 30 40 50 60 70 80 90 100
 *
 * 6
 * Ввести с клавиатуры строку name.
 * Ввести с клавиатуры дату рождения (три числа): y, m, d.
 *
 * Вывести на экран текст:
 * "Меня зовут name.
 * Я родился d.m.y"
 *
 * Пример вывода:
 * Меня зовут Вася.
 * Я родился 15.2.1988
 */

public class Homework {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        //1.
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//
//        for (int i = 0; i < num1; i++) {
//            for (int j = 0; j < num2; j++) {
//                System.out.print("8");
//            }
//            System.out.println();
//        }
//
//        //2.
//        int num = scanner.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("8");
//            }
//            System.out.println();
//        }
//
//        //3.
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//
//        int tmp = (a + b + c) / 3;
//        System.out.println("Среднее значение: " + tmp);
//
//        if (a == b && a == c) {
//            b = c;
//            System.out.println("Все числа равны: " + b);
//        }
//
//        //4.
//        int nums = 0;
//
//        while (true) {
//            int number = scanner.nextInt();
//            nums += number;
//            if (number == -1) {
//                System.out.println("Сумма чисел" + nums);
//                break;
//            }
//        }
//
//        //5.
//        int i = 1;
//        int tmp = 1;
//
//        while (i < 11) {
//            while (tmp < 11){
//                System.out.print(i * tmp + " ");
//                tmp++;
//            }
//            System.out.println();
//            i++;
//            tmp = 1;
//        }

        //6.
        String name = scanner.nextLine();
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.printf("Меня зовут %s" + "\n" + "Я родился %d.%d.%d", name, d, m, y);
    }

}
