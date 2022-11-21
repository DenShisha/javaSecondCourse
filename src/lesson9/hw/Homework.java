package lesson9.hw;

/**
 * 1.
 * Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
 * Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep. Метод makeNoise, например, может выводить на консоль
 * "Такое-то животное спит".
 * Dog, Cat, Horse переопределяют методы makeNoise, eat.
 * Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
 * Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal). Пусть этот метод распечатывает food и location
 * пришедшего на прием животного.
 * В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.
 */

public class Homework {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Horse horse = new Horse();
        Veterinarian veterinarian = new Veterinarian();

        dog.setFood("Dog eats 'Chappi'");
        dog.setLocation("Dog lives in Germany");
        cat.setFood("Cat eats 'Whiskas'");
        cat.setLocation("Cat lives in US");
        horse.setFood("Horse eats grass");
        horse.setLocation("Horse lives in Mexico");

        Animals[] animals = new Animals[3];

        animals[0] = dog;
        animals[1] = cat;
        animals[2] = horse;

        for (int i = 0; i < 3; i++) {
            veterinarian.treatAnimal(animals[i]);
        }
    }
}
