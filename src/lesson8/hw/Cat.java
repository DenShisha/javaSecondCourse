package lesson8.hw;

public class Cat {
    static double defaultWeight = 2.6;
    static int defaultAge = 5;
    private String name;
    private String color;
    private String address;
    private int age;
    private double weight;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
        setAddress(null);
        setAge(defaultAge);
        setWeight(defaultWeight);

    }

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        setAddress(null);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        setWeight(defaultWeight);
        setAddress(null);
    }

    public Cat(String color, double weight) {
        this.color = color;
        this.weight = weight;
        setName(null);
        setAge(defaultAge);
        setAddress(null);
    }

    public Cat(String color, String address, double weight) {
        this.color = color;
        this.address = address;
        this.weight = weight;
        setAge(defaultAge);
        setName(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
