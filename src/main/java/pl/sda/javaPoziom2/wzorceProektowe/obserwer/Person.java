package pl.sda.javaPoziom2.wzorceProektowe.obserwer;

public class Person {
  private   String name;
    private int maxTemperature;

    public Person(String name, int maxTemperature) {
        this.name = name;
        this.maxTemperature = maxTemperature;
    }

    public String getName() {
        return name;
    }


    public int getMaxTemperature() {
        return maxTemperature;
    }

    void updet(int currentTemperature){
        System.out.printf("%s twierdzi, ze temperatura powyzej %s C to zagoronco. Dla mnie max to %s\n", name, currentTemperature, maxTemperature);
    }
}
