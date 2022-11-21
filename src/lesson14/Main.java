package lesson14;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Coin coin1 = new Coin(10, 2.5, "Russia", 2004);
        Coin coin2 = new Coin(20, 2.7, "Belarus", 2007);
        Coin coin3 = new Coin(20, 2.7, "Belarus", 2007);
        Coin coin4 = new Coin(15, 3.1, "SAR", 2010);
        Coin coin5 = new Coin(2, 2.9, "USA", 2011);

        TreeSet<Coin> hashSet = new TreeSet<>();
        hashSet.add(coin1);
        hashSet.add(coin2);
        hashSet.add(coin3);
        hashSet.add(coin4);
        hashSet.add(coin5);

        for (Coin c : hashSet) {
            System.out.println(c);
        }
    }
}
