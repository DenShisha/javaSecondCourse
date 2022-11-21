package lesson13.hw;
import java.util.ArrayList;

public class ArraysList {

    ArrayList<String> arrayList = new ArrayList<>();

    public void showStrings() {
        arrayList.add("Line 1");
        arrayList.add("Line 2");
        arrayList.add("Line 3");
        arrayList.add("Line 4");
        arrayList.add("Line 5");

        System.out.println("Size of array: " + arrayList.size());

        for (String str : arrayList) {
            System.out.println(str);
        }
    }
}
