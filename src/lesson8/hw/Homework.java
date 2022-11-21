package lesson8.hw;

import java.util.Scanner;

/**
 * 1.
 * Требования:
 * Создать класс Human.
 * •  Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 * •  Добавить в класс конструктор public Human(String name, boolean sex, int age).
 * •  Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
 * •  Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
 * •  Выведи созданные объекты на экран
 * <p>
 * public String toString() {
 * String text = "";
 * text += "Имя: " + this.name;
 * text += ", пол: " + (this.sex ? "мужской" : "женский");
 * text += ", возраст: " + this.age;
 * <p>
 * if (this.father != null) {
 * text += ", отец: " + this.father.name;
 * }
 * if (this.mother != null) {
 * text += ", мать: " + this.mother.name;
 * }
 * return text;
 * }
 * <p>
 * 2.
 * Создать класс Cat (кот) с пятью конструкторами:
 * - Имя,
 * - Имя, вес, возраст
 * - Имя, возраст (вес стандартный)
 * - вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
 * - вес, цвет, адрес (чужой домашний кот)
 * Задача конструктора - сделать объект валидным.
 * Например, если вес не известен, то нужно указать какой-нибудь средний вес.
 * Кот не может ничего не весить.
 * То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
 * <p>
 * 3.
 * 1. Внутри класса Solution создай public static классы Man и Woman.
 * 2. У классов должны быть поля: name (String), age (int), address (String).
 * 3. Создай конструкторы, в которые передаются все возможные параметры.
 * 4. Создай по два объекта каждого класса со всеми данными используя конструктор.
 * 5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
 * В этой задаче можно создавать static class внутри основного класса
 * <p>
 * 4.
 * Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
 * Вывести на экран полученную сумму.
 * <p>
 * 5.
 * Написать программу, которая:
 * 1. считывает с консоли число N, которое должно быть больше 0
 * 2. потом считывает N чисел с консоли
 * 3. выводит на экран максимальное из введенных N чисел.
 */

public class Homework {

    public static void main(String[] args) {
        Human father = new Human("David", true, 42);
        Human mother = new Human("Sara", false, 40);
        Human aunt = new Human("Robbin", false, 38);
        Human uncle = new Human("Barney", true, 35);

        Human brother = new Human("Alexander", true, 15, father, mother);
        Human brother2 = new Human("Leon", true, 12, father, mother);
        Human sister = new Human("Kathy", false, 8, father, mother);
        Human brother3 = new Human("Steven", true, 5, father, mother);
        Human sister2 = new Human("Mia", false, 3, father, mother);

        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(aunt.toString());
        System.out.println(uncle.toString());
        System.out.println(brother.toString());
        System.out.println(brother2.toString());
        System.out.println(sister.toString());
        System.out.println(brother3.toString());
        System.out.println(sister2.toString());

//        Cat cat = new Cat("Cat", 6);
//        System.out.println(cat.toString());
        //sum();
        nums();
    }

    //4.
    public static void sum() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String str;

        while (true) {
            str = scanner.nextLine();

            if (!str.equals("Сумма")) {
                System.out.println("Enter a number: ");
                num += Integer.parseInt(str);
                System.out.println("Sum = " + num);

            }
            if (str.equals("Сумма")) {
                System.out.println("Sum = " + num);
                break;
            }
        }
    }

    //5.
    public static void nums() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int[] nums = new int[10];
        int max = nums[0];

        if (num > 0) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = scanner.nextInt();
            }
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] < nums[i + 1]) {
                    max = nums[i+1];
                }

            }
            System.out.println(max);
        }
    }
}
