package lesson13.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList4 {

    ArrayList<String> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void stringToSort() {
        String line;

        for (int i = 0; i < 10; i++) {
            line = scanner.nextLine();
            arrayList.add(0, line);
        }

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
