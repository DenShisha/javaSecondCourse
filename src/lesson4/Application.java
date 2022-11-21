package lesson4;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int s = scanner.nextInt();
//        if (s > 0){
//            System.out.println("Number > 0");
//        } else
//            System.out.println("number < 0");
        //===========================================================
        //циклы for i, for each, while
        //===========================================================
//
//        System.out.println("Вывести числа от 100 до 150, кот-е делятся и на 3 и на 5");
//        for (int i = 100; i <= 150; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.print(i + ", ");
//            }
//        }
//
//
//
//
//
//
        System.out.println("Вывести на консоль 'Hello world' столько раз, какую цифру введет пользователь");
        int num = scanner.nextInt();

        while (num > 0) {
            System.out.println("Hello world");
            num--;
        }
    }

}
