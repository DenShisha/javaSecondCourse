package lesson16.stream_api;

import lesson16.Specialty;

public class Specialist {

    //Поля

    private String name;
    private Integer salaru;
    private Specialty specialty;

    //Конструкторы

    public Specialist(String name, Integer salaru, Specialty specialty) {
        this.name = name;
        this.salaru = salaru;
        this.specialty = specialty;
    }

    //Методы


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalaru() {
        return salaru;
    }

    public void setSalaru(Integer salaru) {
        this.salaru = salaru;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
