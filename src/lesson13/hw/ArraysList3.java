package lesson13.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList3 {

    ArrayList<String> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public void sortedList() {
        String line;

        for (int i = 0; i < 5; i++) {
            line = scanner.nextLine();
            arrayList.add(i, line);
        }

        int tmp = arrayList.get(0).length();
        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i).length() < tmp) {
                if (tmp == arrayList.get(i).length())
                    tmp = arrayList.get(i).length();

                System.out.println("Das ist: " + arrayList.get(i));
            }
        }
    }
}
