package lesson7.hw;

import java.util.Scanner;

/**
 * 1
 * Напишите метод, с помощью которого можно было бы возводить число, переданное в сигнатуру метода, в куб.
 * <p>
 * 2
 * Напишите метод, который бы возвращал в консоль:
 * true, если число больше 5
 * и false, если число меньше 5
 * <p>
 * 3
 * Необходимо написать метод, который бы возвращал из 2 чисел меньшее число. Например,
 * из двух чисел 7 и 3 метод должен вывести в консоль 3.
 * <p>
 * 4
 * Необходимо написать метод, который бы возводил число в степень. И далее два числа, возведенные в степень,
 * должны быть просуммированы, а результат выведен в консоль.
 * <p>
 * 5
 * Условие задачи:
 * Необходимо написать простой консольный калькулятор на Java.
 * <p>
 * Метод int getInt() - должен считывать с консоли целое число и возвращать его
 * Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
 * Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
 * Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(), передать все методу calc()
 * и вывести на экран результат.
 */

public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(cube(3));
        System.out.println(numbers(6));
        System.out.println(difference(3, 4));
        System.out.println(nums(4, 2));

        int num1 = getInt(scanner.nextInt());
        int num2 = getInt(scanner.nextInt());
        char ch = getOperation();

        System.out.println(calc(num1, num2, ch));
    }

    //1.
    public static int cube(int a) {
        return a * 3;
    }

    //2.
    public static boolean numbers(int a) {
        return a > 5;
    }

    //3.
    public static int difference(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    //4.
    public static int nums(int a, int b) {
        return (a * a) + (b * b);
    }

    //5.
    public static int getInt(int a) {
        return a;
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        char a = 0;
        System.out.println("Выбирете операцию: '+', '*', '-', '*'");
        String str = scanner.nextLine();

        if (str.contains("+")) {
            return a = '+';
        }
        if (str.contains("-")) {
            return a = '-';
        }
        if (str.contains("*")) {
            return a = '*';
        }
        if (str.contains("/")) {
            return a = '/';
        }

        return a;
    }

    public static int calc(int a, int b, char c) {

        int calc = 0;

        if (c == '+') {
            return calc = a + b;
        }
        if (c == '*') {
            return calc = a * b;
        }
        if (c == '-') {
            return calc = a - b;
        }
        if (c == '/') {
            return calc = a / b;
        }

        return calc;
    }
}
