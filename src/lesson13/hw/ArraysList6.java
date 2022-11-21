package lesson13.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList6 {

    ArrayList<String> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void shortOrLong() {
        String line;

        for (int i = 0; i < 10; i++) {
            line = scanner.nextLine();
            arrayList.add(i, line);
        }

        int shortString = arrayList.get(0).length();
        int longString = arrayList.get(0).length();
        int max = 0;
        int min = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() > longString) {
                longString = arrayList.get(i).length();
                max = i;
            }
            if (arrayList.get(i).length() < shortString) {
                shortString = arrayList.get(i).length();
                min = i;
            }
        }

        System.out.println(max < min ? "First is max " + arrayList.get(max) : "First is min " + arrayList.get(min));

    }
}
