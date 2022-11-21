package lesson13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * ArrayList<Integer> - это безразмерная коллекция, реализация изменяемого массива интерфейса List.
 * Изменяет размер динамически, но может включать в себя элементы только одного типа.
 * Примитивные типы нельзя хранить внутри коллекций.
 Для этого есть ссылочные типы примитивов:
 int Integer
 byte Byte
 short Short
 char Character
 * */

public class MainArrayList {

    public static void main(String[] args) {

        // 1. Создание коллекции и заполнение значениями
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        numbers.add(44);

        System.out.println("Collections elements: " + numbers);

        //2. Добавление в коллекцию с указанием индекса
        try {
            numbers.add(2, 55); //ленивая кнопкка - Ctrl + Alt + T
        } catch (Exception e) {
            e.printStackTrace();
        }

        //3. Метод size() - возвращает размер коллекции

        System.out.println("Размер коллекции: " + numbers.size());

        //4. Метод set() - устанавливает объект на определенный индекс, удаляя предыдущий объект из коллекции

        numbers.set(2, 77);

        // 5. Метод get() - получение элемента коллекции

        Integer b = numbers.get(0);
        System.out.println(b);

        for (Integer c : numbers) {
            System.out.println(c);
        }

        // 6. Метод toArray - возвращение коллекции ввиде массива

        Object[] array = numbers.toArray();
        for (Object o : array) {
            System.out.println(o);
        }

        // 7. Метод contains() - проверка на наличие этого эл-та в коллекции

        System.out.println("Is element 11 contains? : " + numbers.contains(11));
        System.out.println("Is element 99 contains? : " + numbers.contains(99));

        // 8. Метод addAll - добавление всех эл-в старой коллекции в новую

        ArrayList<Integer> copyArray = new ArrayList<>();
        copyArray.addAll(numbers);

        // 9. remove() - удалить эл-т кол-и по индексу

        numbers.remove(2);

        // 10. Метод indexOf() - возвращает индекс эл-та коллек-и

        System.out.println("Element 11 is: " + numbers.indexOf(11));

        // 11. isEmpty - true/false

        System.out.println("Is empty collection? - " + numbers.isEmpty());

        // 12. clear() - delete all elements

        numbers.clear();

        System.out.println("Program is continue");

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(11);
        linkedList.add(22);
        linkedList.add(33);
        linkedList.add(44);
        linkedList.add(55);

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.removeFirst();
        linkedList.removeLast();

        HashSet<Integer> integers = new HashSet<>();
        integers.add(11);
        integers.add(22);
        integers.add(22);
        integers.add(44);
        integers.add(55);

        HashSet<String> strings = new HashSet<>();
        strings.add("AA");
        strings.add("BB");
        strings.add("BB");
        strings.add("CC");

        LinkedHashSet<Integer> integers1 = new LinkedHashSet<>();
        integers1.add(11);
        integers1.add(22);
        integers1.add(22);
        integers1.add(44);
        integers1.add(55);

        LinkedHashSet<String> strings1 = new LinkedHashSet<>();
        strings1.add("AA");
        strings1.add("BB");
        strings1.add("BB");
        strings1.add("CC");




    }
}
