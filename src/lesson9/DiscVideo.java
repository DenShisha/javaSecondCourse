package lesson9;

public class DiscVideo extends Disk{

    //1. Поля

    private String director; // режиссер
    private String genre; // жанр
    private int time; // продолжительность

    //2. Конструкторы

    //3. Методы

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


    @Override
    public void printInfo() {
        System.out.println("Film - " + getName() + " year - " + getYeaк() + " producer - " + getDirector());
    }
}
