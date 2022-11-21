package lesson9;

public abstract class Disk {
    private String name; //Название фильма
    private int yeaк; // год выхода

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYeaк() {
        return yeaк;
    }

    public void setYeaк(int yeaк) {
        this.yeaк = yeaк;
    }

    public abstract void printInfo();
}
