package lesson13.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysList5 {

    ArrayList<String> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void deletedElementsOfArray() {
        String line;

        for (int i = 0; i < 5; i++) {
            line = scanner.nextLine();
            arrayList.add(i, line);
        }

        String str;
        for (int i = 0; i < 13; i++) {
            str = arrayList.remove(arrayList.size() - 1);
            arrayList.add(0, str);
        }

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
