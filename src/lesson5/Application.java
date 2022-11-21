package lesson5;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
//        int [] arr = {5, 7, 10};
//
//        int firstSlot = arr[0];
//        int secondSlot = arr[1];
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        int [] arr2 = new int[5];
//
//        //foreach
//        for (int ms : arr) {
//            System.out.println(ms);
//        }

//        int [] array = new int[100];
//        int count = 0;
//
//        for (int i = 0; i < 100; i++) {
//            if (i % 5 == 0) {
//                array[count] = i;
//                count++;
//            }
//        }
        Scanner scanner = new Scanner(System.in);
        int [] street = new int [10];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 10; i++) {
            street[i] = scanner.nextInt();

            if (i % 2 == 0) {
                even += street[i];
            } else
                odd += street[i];

        }
        if (even > odd) {
            System.out.println(even);
        } else
            System.out.println(odd);
    }

}
