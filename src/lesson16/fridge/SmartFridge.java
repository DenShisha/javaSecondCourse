package lesson16.fridge;

import java.util.HashMap;

public class SmartFridge {
    private HashMap<String, Integer> goods = new HashMap<>();

    public void putGoods(String good, int value) {
        if (goods.containsKey(good)) {
            goods.put(good, value + goods.get(good));
        } else
            goods.put(good,value);
    }

    public void getGoods(String good, int value) {
        //если этого продукта нет
        if (!goods.containsKey(good)) {
            System.out.println("Такого продукта нет");
            return;
        }

        //если продукта достаточно в вашем холодильнике
        if (goods.get(good) == value) {
            System.out.println("Продукта " + good + " достаточно");
            goods.remove(good);
            return;
        }

        //если продукта недостаточно в вашем холодильнике
        if (goods.get(good) < value) {
            System.out.println("Продукта " + good + " недостаточно, больше нет " + goods.get(good));
            goods.remove(good);
            return;
        }

    }
}
