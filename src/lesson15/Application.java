package lesson15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

public class Application {

    public static void main(String[] args) {
        // "-----------------------------------------------------------------"
//        System.out.println("1. Принцип работы Exception");
//        int a = 10;
//        int b = 0;
//        System.out.println(a / b);

        // "-----------------------------------------------------------------"

//        System.out.println("2. Exception / null");
//        String text = null;
//        System.out.println(text.length());
//
//        NullPointerException nullPointerException = new NullPointerException();
//        nullPointerException.printStackTrace();
//        System.exit(0);

        // "-----------------------------------------------------------------"

        System.out.println("3. Обход Exception с помощью if/else");
        String password = null;
        //System.out.println(password.length());
        if (password != null) {
            System.out.println(password.length());
        }

        System.out.println("Продолжение программы");

        // "-----------------------------------------------------------------"

        System.out.println("4. Обработка Exception без if/else");
        try {
            Files.copy(new File("D:/programms/User/Desktop/file.jpg").toPath(),
                    new File("D:/programms/User/Desktop/newfile.jpg").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // "-----------------------------------------------------------------"

        System.out.println("5. Еще один пример с try/catch");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // "-----------------------------------------------------------------"

        System.out.println("6. try/catch/finally");

        try {
            Files.copy(new File("D:/programms/User/Desktop/file.jpg").toPath(),
                    new File("D:/programms/User/Desktop/newfile.jpg").toPath());
        } catch (NoSuchFileException e) {
            e.printStackTrace();
            System.out.println("File используется другой программой");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Возникла неведомая ошибка, иди разбирайся");
        } finally {
            // взять шаблонный файл, закрыть потоки, очистить кэш, занести запись в лог дополнит-ю
        }

        Dog dog = new Dog("Sharik");
        dog.putCollar();
        dog.putLeash();
        dog.putMuzzle();

        try {
            dog.walk();
        } catch (DogIsNotReadyToWalkException e) {
            e.printStackTrace();
        }
    }
}
