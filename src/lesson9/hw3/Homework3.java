package lesson9.hw3;

/**
 * 3.
 * Создать класс Person, который содержит:
 * переменные fullName, age;
 * методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 * Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 */

public class Homework3 {

    public static void main(String[] args) {

        Person person = new Person("David Sparks", 32);
        Person person1 = new Person();
        person1.setFullName("Maria Rojo");
        person1.setAge(20);

        person.move();
        person1.talk();
    }

}
