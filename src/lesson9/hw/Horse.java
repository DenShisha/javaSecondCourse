package lesson9.hw;

public class Horse extends Animals {

    private int hooves;

    public int getHooves() {
        return hooves;
    }

    public void setHooves(int hooves) {
        this.hooves = hooves;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse is sleep");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
