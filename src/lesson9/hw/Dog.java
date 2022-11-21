package lesson9.hw;

public class Dog extends Animals {

    private String colorOfDogsHouse;

    public String getColorOfDogsHouse() {
        return colorOfDogsHouse;
    }

    public void setColorOfDogsHouse(String colorOfDogsHouse) {
        this.colorOfDogsHouse = colorOfDogsHouse;
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog is sleep");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
