package lesson6.hw;

import java.util.Scanner;

/**
 * 1
 * Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
 *  Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
 *
 * Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
 * Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
 * Программа выводит слова на экран.
 *
 * 2
 * Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
 *
 * 3
 * 1. Создать массив на 10 строк.
 * 2. Ввести с клавиатуры 8 строк и сохранить их в массив.
 * 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
 *
 * 4
 * 1. Создать массив на 10 строк.
 * 2. Создать массив на 10 чисел.
 * 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 * 4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
 *  которой совпадает с текущим индексом из массива чисел.
 *
 * 5
 * 1. Считать 6 строк и заполнить ими массив strings.
 * 2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
 */

public class Homewwork {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
//
//        //1.
//
//        while (!string.equals("")) {
//            System.out.println(string.toUpperCase());
//
//            if (string.length() % 2 == 0) {
//                string += string;
//                System.out.println(string);
//                break;
//            } else {
//                System.out.println(string + string + string);
//                break;
//            }
//        }
//
//        //2.
//       String[] strings = new String[5];
//
//        for (int i = 0; i < strings.length; i++) {
//            strings[i] = scanner.nextLine();
//        }
//
//        int tempMin = strings[0].length();
//        int tempMax = strings[0].length();
//        String max = null;
//        String min = null;
//
//        for (String s : strings) {
//            if (s.length() > tempMax) {
//                tempMax = s.length();
//                max = s;
//            }
//            if (s.length() < tempMin) {
//                tempMin = s.length();
//                min = s;
//            }
//        }
//        System.out.println("Самая длинная строка: " + max + " = " + tempMax + "\n"
//                + "Самая короткая строка: " + min + " = " + tempMin);
//
//        //3.
//        String[] str = new String[10];
//
//        for (int i = 0; i < 8; i++) {
//            str[i] = scanner.nextLine();
//        }
//
//        for (int i = str.length - 1; i >= 0; i--) {
//            System.out.println(str[i]);
//        }
//
//        //.4
//        String[] str = new String[10];
//        int[] num = new int[10];
//
//        for (int i = 0; i < str.length; i++) {
//            str[i] = scanner.nextLine();
//        }
//
//        for (int i = 0; i < num.length; i++) {
//            num[i] = str[i].length();
//            System.out.println(str[i] + " = " + num[i]);
//        }

        //5.
        String[] strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        String s = null;

        for (int i = 0; i < strings.length-1; i++) {
            for (int j = i+1; j < strings.length; j++) {
                if (strings[i] != null) {
                    if (strings[i].equals(strings[j])) {
                        strings[j] = s;
                    }
                }
            }
        }
        for (String s2 : strings) {
            System.out.println(s2);
        }
    }

}
