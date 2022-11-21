package lesson13;

public class Main {

    public static void main(String[] args) {

        int a = 100;
        long startPoint = System.currentTimeMillis();

        for (int i = 0; i < a; i++) {
            System.out.println("Hello World");
        }

        long endPoint = System.currentTimeMillis();
        long result = endPoint - startPoint;

        System.out.println("Печать " + a + " кол-ва раз заняла у нас " + result);

        People son = new People("Leo", 12);

        System.out.println(son.getAge() < 16 ? "You can't to watch this movie" : "Come in");

//        if (son.getAge() < 16) {
//            System.out.println("You can't to watch this movie");
//        } else
//            System.out.println("Come in");
    }

}
