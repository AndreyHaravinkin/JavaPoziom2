package pl.sda.javaPoziom2.osoba;

public class Person {
    String name;
    int age;
    double salary;
    Sex sex;

    public Person(String name, int age, double salary, Sex sex) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public Sex getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

}
