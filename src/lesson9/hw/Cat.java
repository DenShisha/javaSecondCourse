package lesson9.hw;

public class Cat extends Animals {

    private int catsEars;

    public int getCatsEars() {
        return catsEars;
    }

    public void setCatsEars(int catsEars) {
        this.catsEars = catsEars;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat is sleep");
    }

    @Override
    public void eat() {
        super.eat();
    }


}
