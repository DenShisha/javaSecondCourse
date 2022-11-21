package lesson2;

public class Application {

    public static void main(String[] args) {
//        byte firstByte = 60;
        System.out.println("Целочисленные типы");

        byte a = 60;
        byte b = 45;
        byte c = 17;
        int sum = a + b + c;

        System.out.println("Задача 1. Дано: a = 60, b = 45, c = 17. Найти периметр");
        System.out.println("Результат задачи 1: " + sum);
        System.out.println("\n");
        System.out.println("Задача 3. Дано: Коля получил много двоек и закопал свой дневник на 127 метров." +
                " А потом вернулся и закопал еще на 2 метра глубже" +
                " насколько метров Коля закопал свой дневник?");

        byte deep = 127;
        byte additionalDeep = 2;
        byte sumDeep = (byte) (deep + additionalDeep);
        System.out.println("Результат задачи 3: " + sumDeep);

        System.out.println("\n");
        System.out.println("Задача 5. Дано: Есть 10, 3 и метод научного тыка. Найти длину после запятой float и double");

        int sample = 10;
        float dividibleFloat = 3;
        double dividebleDouble = 3;
        float resultFloat = sample / dividibleFloat;
        double resultDouble = sample / dividebleDouble;

        System.out.println("Результат float: " + resultFloat);
        System.out.println("Результат double: " + resultDouble);

        System.out.println("\n");
        System.out.println("Задача 6. Дано: 10 красных и 5 зеленых яблок. Вопрос: Верно ли утверждение, что красных яблок больше?");
        int appleRed = 10;
        int appleGreen = 5;
        boolean result = appleRed < appleGreen;
        System.out.println(result);

    }
}
