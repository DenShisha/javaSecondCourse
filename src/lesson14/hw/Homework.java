package lesson14.hw;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1.
    * Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
 * 2.
    * 1. Создай список из слов "мама", "мыла", "раму".
    * 2. После каждого слова вставь в список строку, содержащую слово "именно".
    * 3. Вывести результат на экран, каждый элемент списка с новой строки.
 * 3.
    * 1. Создай список слов, заполни его самостоятельно.
     * 2. Метод fix должен:
    * 2.1. удалять из списка строк все слова, содержащие букву "р"
    * 2.2. удваивать все слова содержащие букву "л".
    * 2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
    * 2.4. с другими словами ничего не делать.
 * 4.
    * 1. Введи с клавиатуры 10 слов в список строк.
    * 2. Метод doubleValues должен удваивать слова по принципу:
    * "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
    * 3. Выведи результат на экран, каждое значение с новой строки.
 * 5.
    * 1. Введи с клавиатуры 10 слов в список строк.
    * 2. Определить, является ли список упорядоченным по возрастанию длины строки.
    * 3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
 */

public class Homework {

    static Scanner scanner;

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        ArrayList<String> arrayList5 = new ArrayList<>();

        reversedArray(arrayList);
        newWords(arrayList2);
        fix(arrayList3);
        doubleValues(arrayList4);
        longestString(arrayList5);
    }

    private static void reversedArray(ArrayList<String> arrayList) {
        scanner = new Scanner(System.in);
        String text;
        System.out.println("Введите 5 строк: ");

        for (int i = 0; i < 5; i++) {
            text = scanner.nextLine();
            arrayList.add(text);
        }
        arrayList.remove(2);

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }

    private static void newWords(ArrayList<String> arrayList) {

        arrayList.add("мама");
        arrayList.add("мыла");
        arrayList.add("раму");

        String text = " именно";
        String str;

        for (int i = 0; i < 3; i++) {
            str = arrayList.get(i) + text;
            arrayList.set(i, str);
        }

        for (String string : arrayList) {
            System.out.println(string);
        }
    }

    private static void fix(ArrayList<String> arrayList) {
        arrayList.add("роза");
        arrayList.add("лоза");
        arrayList.add("лира");

        String str;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).contains("р") && !arrayList.get(i).contains("л")) {
                arrayList.remove(i);
            }
            if (arrayList.get(i).contains("л") && !arrayList.get(i).contains("р")) {
                str = arrayList.get(i) + arrayList.get(i);
                arrayList.set(i, str);
            }
            System.out.println(arrayList.get(i));
        }
    }

    private static void doubleValues(ArrayList<String> arrayList) {

        scanner = new Scanner(System.in);

        String text;

        System.out.println("Введите 10 слов: ");
        for (int i = 0; i < 10; i++) {
            text = scanner.nextLine();
            arrayList.add(text);
        }

        ArrayList arList;
        arList = (ArrayList)arrayList.clone();

        for (int i = 0; i < 10; i++) {
            System.out.println(arrayList.get(i) + ", " + arList.get(i));
        }
    }

    private static void longestString(ArrayList<String> arrayList) {

        scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arrayList.add(scanner.nextLine());
        }

        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i).length() < arrayList.get(i + 1).length()) {
            } else if (arrayList.get(i).length() > arrayList.get(i + 1).length()){
                System.out.println(arrayList.get(i + 1));
                break;
            }
        }
    }

}
