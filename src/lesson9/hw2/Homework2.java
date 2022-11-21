package lesson9.hw2;

/**
 * 2.
 * Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 * Создать класс Basket, содержащий массив купленных товаров.
 * Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.
 */

public class Homework2 {

    public static void main(String[] args) {
        Goods apple = new Goods("Apple", 20.4, "5+");
        Goods milk = new Goods("Milk", 50, "4,4");
        Goods pizza = new Goods("Pizza", 400.5,"5");
        Goods phone = new Goods("iphone", 80000.9, "4.2");
        Goods tv = new Goods("LG", 40000, "4,9");
        Goods videoConsole = new Goods("SP5", 75000.9, "5");

        Category food = new Category();
        Category electronicDevices = new Category();

        Basket basket = new Basket();
        User user = new User("Edward", "qwerty123", basket);

        Goods[] goods = new Goods[3];
        goods[0] = apple;
        goods[1] = milk;
        goods[2] = pizza;

        Goods[] goods1 = new Goods[3];
        goods1[0] = phone;
        goods1[1] = tv;
        goods1[2] = videoConsole;

        food.setGoods(goods);
        electronicDevices.setGoods(goods1);

        Goods[] yourGoods = new Goods[2];
        yourGoods[0] = goods[2];
        yourGoods[1] = goods1[2];

        basket.setGoods(yourGoods);
        user.setBasket(basket);

        System.out.println();

    }
}
