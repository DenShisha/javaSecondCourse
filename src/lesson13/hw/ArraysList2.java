package lesson13.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList2 {

    ArrayList<String> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addString() {
        String line;

        for (int i = 0; i < 5; i++) {
            line = scanner.nextLine();
            arrayList.add(i, line);
        }

        int maxStr = arrayList.get(0).length();

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() >= maxStr) {
                maxStr = arrayList.get(i).length();
                System.out.println("Most of long string: " + maxStr + ", " + arrayList.get(i));
            }
        }
    }

}
