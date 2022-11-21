package lesson14;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetMain {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        treeSet.add(20);
        treeSet.add(56);
        treeSet.add(11);
        treeSet.add(17);
        treeSet.add(112);

        TreeSet<String> strings = new TreeSet<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("bbb");
        strings.add("ddd");
        strings.add("ccc");
        strings.add("fff");

        System.out.println();
    }

}
