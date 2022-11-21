package lesson16.hw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 1
    * 1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
    * 2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
    * 3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
    * 4. Вывести содержимое Map на экран.
 *
 * 2
    * Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
    * Используй коллекции.
 *
 * 3
    * Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
    * Новая задача: Программа должна работать не с номерами домов, а с городами:
    *
    * Пример ввода:
    * Москва
    * Ивановы
    * Киев
    * Петровы
    * Лондон
    * Абрамовичи
    *
    * Лондон
    *
    * Пример вывода:
    * Абрамовичи
 *
 * 4
    * Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
    * арбуз - ягода,
    * банан - трава,
    * вишня - ягода,
    * груша - фрукт,
    * дыня - овощ,
    * ежевика - куст,
    * жень-шень - корень,
    * земляника - ягода,
    * ирис - цветок,
    * картофель - клубень.
    * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    *
    * Пример вывода (тут показана только одна строка):
    * картофель - клубень
 *
 * 5
    * Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар объектов.
    * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
    *
    * Пример вывода (тут показана только одна строка):
    * Sim - 5
    *
    * public static void main(String[] args) {
    *         Map<String, Object> map = new HashMap<>();
    *         map.put("Sim", 5);
    *         map.put("Tom", 5.5);
    *         map.put("Arbus", false);
    *         map.put("Baby", null);
    *         map.put("Cat", "Cat");
    *         map.put("Eat", new Long(56));
    *         map.put("Food", new Character('3'));
    *         map.put("Gevey", '6');
    *         map.put("Hugs", 111111111111L);
    *         map.put("Comp", (double) 123);
    *
    *         //напишите тут ваш код
    *
    *     }
 */

public class HomeWork {

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Map<String, String> map3 = new HashMap<>();
        Map<String, String> map4 = new HashMap<>();
        Map<String, Object> map5 = new HashMap<>();

        //putNames(map1);
        //getMonth(map2);
        //findFamily(map3);
        //getMap(map4);
        getObjects(map5);
    }

    public static void putNames(Map<String, String> map) {
        map.put("Федоров", "Федя");
        map.put("Иванов", "Иван");
        map.put("Николаев", "Николай");
        map.put("Смирнов", "Евгений");
        map.put("Петров", "Петр");
        map.put("Денисов", "Денис");
        map.put("Олегов", "Олег");
        map.put("Ноунейм", "Петр");
        map.put("Васильев", "Василий");
        map.put("Петров", "Денис");

        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    public static void getMonth(Map<String, Integer> map) {
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("Jule", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Month: ");

            String month = scanner.nextLine();

            if (map.containsKey(month)) {
                System.out.println(month + " : " + map.get(month));
            } else
                System.out.println("Try again");
            continue;
        }
    }

    public static void findFamily(Map<String, String> map) {
//        map.put("1", "Ивановы");
//        map.put("2", "Петровы");
//        map.put("3", "Смирновы");
//        map.put("4", "Кузнецовы");
//        map.put("5", "Сидоровы");

        map.put("Москва", "Ивановы");
        map.put("Питер", "Петровы");
        map.put("Казань", "Смирновы");
        map.put("Самара", "Кузнецовы");
        map.put("Сочи", "Сидоровы");

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите номер дома от 1 до 5: ");
        System.out.println("Введите город Москва, Питер, Казань, Самара или Сочи: ");
        String num = scanner.nextLine();

        if (map.containsKey(num)) {
            System.out.println(map.get(num));
        }
    }

    public static void getMap(Map<String, String> map) {
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", map.get("арбуз"));
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", map.get("арбуз"));
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }

    public static void getObjects(Map<String, Object> map) {
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", 6);
        map.put("Hugs", 11111111111111L);
        map.put("Comp", (double) 123);

        for (Map.Entry<String, Object> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
