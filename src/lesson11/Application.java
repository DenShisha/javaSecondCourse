package lesson11;

public class Application {

    public static void main(String[] args) {
        int f = factorial(5);
        System.out.println(f);
    }

    static int factorial(int x) { // x(5) = 5*4*3*2*1

        if (x == 1) {
            return 1;
        }

        return x * factorial(x - 1);
    }
}
