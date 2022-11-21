package lesson6;

import java.util.Scanner;

/**
 String и его основные методы

 length() - возвращает длину строки

 concat(): объединяет строки / +=

 1 - String является неизменяемым типом

 equals(): сравнивает строки с учетом регистра

 equalsIgnoreCase(): сравнивает строки без учета регистра

 startsWith(): определяет, начинается ли строка с подстроки

 endsWith(): определяет, заканчивается ли строка на определенную подстроку

 String replace(char oldChar, char newChar)
 Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.

 String[] split(String regex)
 Разделяет эту строку, окружая данным регулярным выражением.

 trim(): удаляет начальные и конечные пробелы

 toLowerCase(): переводит все символы строки в нижний регистр

 toUpperCase(): переводит все символы строки в верхний регистр

 2 - StringBuffer и StringBuilder
 * */

public class Application {

    public static void main(String[] args) {
//        char data[] = {'a', 'b', 'c'};
//        String str = new String(data);
//
//        int length = data.length;
//        int lll = str.length();
//
//        String str1 = "Hello World";
//
//        System.out.println(str1.length());
//
//        String str2 = "Hello ";
//        String str3 = "World";
//        str2 += str3;
//
//        System.out.println(str2);
//
//        boolean b = str3.equals("World");
//        System.out.println(b);
//
//        String str4 = "Ivanov";
//        String str5 = "ivanov";
//        boolean c = str4.equalsIgnoreCase(str5);

//        System.out.println("Задача 1. Принять от пользователя текст с консоли и перевернуть его.\" +\n" +
//                "                Пример: Привет! Результат: !тевирП");
//        Scanner scanner =new Scanner(System.in);
//        String string = scanner.nextLine();
//
//        for (int i = string.length() - 1; i >= 0; i++) {
//            System.out.println(string.charAt(i));
//        }

        System.out.println("Задача 2. Поиск и замена символов в тексте");
        String sstr = "/Hello*World!";
        sstr = sstr.replace("*", " ");
        sstr = sstr.replace("/", "");
        System.out.println(sstr);

        System.out.println("3. Проверить email на корректность");
        System.out.println("введите адре эл почты: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
//        int index = email.indexOf("@");
//        System.out.println(index);
        //mail@yandex2ru
        if (email.indexOf("@") == -1) {
            System.out.println("Нужно ввести почту с '@'");
            return;
        }

        String[] sss = email.split("@");
        if (sss.length != 2) {
            System.out.println("email содержит больше 1 '@'");
            return;
        }


        //3. .mail.@.yandex.ru
        String partbeforeDog = sss[0];
        String partAfterDog = sss[0];
        if (partbeforeDog.startsWith(".") || partAfterDog.endsWith(".")) {
            System.out.println("Неверный email");
            return;
        }

        if (partAfterDog.startsWith(".") || partAfterDog.endsWith(".")) {
            System.out.println("Неверный email");
            return;
        }

        //4  mail.@.yandex.ru
        if (email.contains(" ")) {
            email = email.trim();
        }

        //5 mAil@yAndex.ru
        if (email.contains("A")) {
            email = email.toLowerCase();
        }

        System.out.println("Все гуд");

    }


}
