package lesson16.fridge;

public class Main {
    public static void main(String[] args) {
        SmartFridge smartFridge = new SmartFridge();
        smartFridge.putGoods("Apple", 5);
        smartFridge.putGoods("Eggs", 10);
        smartFridge.putGoods("Milk", 1);
        smartFridge.putGoods("Carrot", 10);
        smartFridge.putGoods("Coke", 3);
        smartFridge.putGoods("Coke", 1);

        smartFridge.getGoods("Pear", 1);
        smartFridge.getGoods("Milk", 1);
        smartFridge.getGoods("Eggs", 11);
    }
}
