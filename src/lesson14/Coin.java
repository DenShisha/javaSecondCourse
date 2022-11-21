package lesson14;

import java.util.Objects;

public class Coin implements Comparable<Coin> {
    //Поля
    private int nominal;
    private double diametr;
    private String country;
    private int year;

    //Конструткор

    public Coin(int nominal, double diametr, String country, int year) {
        this.nominal = nominal;
        this.diametr = diametr;
        this.country = country;
        this.year = year;
    }

    //Методы


    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", diametr=" + diametr +
                ", country='" + country + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        return nominal == coin.nominal &&
                Double.compare(coin.diametr, diametr) == 0 &&
                year == coin.year &&
                country.equals(coin.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, diametr, country, year);
    }


    @Override
    public int compareTo(Coin o) {
        if (this.getYear() != o.getYear()) {
            return this.getYear() - o.getYear();
        }
        if (this.getNominal() != o.getNominal()) {
            return this.getNominal() - o.getNominal();
        }
        if (this.getDiametr() != o.getDiametr()) {
            return Double.compare(this.getDiametr(), o.getDiametr());
        }

        return this.getCountry().compareTo(o.getCountry());
    }
}
