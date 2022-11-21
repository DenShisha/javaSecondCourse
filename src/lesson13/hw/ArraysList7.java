package lesson13.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList7 {

    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<Integer> arrayListA = new ArrayList<>();
    ArrayList<Integer> arrayListB = new ArrayList<>();
    ArrayList<Integer> arrayListC = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addNumbers() {

        int num;

        for (int i = 0; i < 20; i++) {
            num = scanner.nextInt();
            arrayList.add(i, num);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 3 == 0) {
                arrayListA.add(arrayList.get(i));
            }
            if (arrayList.get(i) % 2 == 0) {
                arrayListB.add(arrayList.get(i));
            } else {
                arrayListC.add(arrayList.get(i));
            }
        }
    }

    public void printList() {
        for (int a : arrayListA) {
            System.out.println(a);
        }
        System.out.println("===========");

        for (int b : arrayListB) {
            System.out.println(b);
        }
        System.out.println("===========");


        for (int c : arrayListC) {
            System.out.println(c);
        }
    }
}
