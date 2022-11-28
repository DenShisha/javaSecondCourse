package lesson18.hw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FourthHW {

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> catMap = new HashMap<>();
        int count = 1;
        for (int i = 0; i < 10; i++) {
            catMap.put("cat - " + count, new Cat(""));
            count++;
        }
        return catMap;
    }
    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet<Cat> catsSet = new HashSet<>();
        for (String s : map.keySet()) {
            catsSet.add(new Cat(s));
        }
        return catsSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static void getCats() {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

}
