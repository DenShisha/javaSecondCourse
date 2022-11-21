package lesson10;

public abstract class AbstractEmployer implements Employer {

    String name;
    int age;
    @Override
    public String getFullName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void doWork() {
        System.out.println("Writing code");
    }

    @Override
    public void keepSalary() {
        System.out.println("Counting money");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
