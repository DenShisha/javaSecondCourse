package lesson9;

public class DiscAudio extends Disk{
    //1. Поля
    private int count; //кол-во
    private String genre;

    //2. Конструкторы

    //3. Методы

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void printInfo() {
        System.out.println("Film - " + getName() + " year - " + getYeaк() + " genre - " + getGenre());
    }
}
