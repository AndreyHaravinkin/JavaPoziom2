package pl.sda.javaPoziom2.wzorceProektowe.obserwer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weather {
    private List<Person> observes;
    private int currentTemperature;

    public Weather() {
        observes = new ArrayList<Person>();
        currentTemperature = 0;
    }

    public void addObserver(Person person){
        observes.add(person);
    }
    public void addObserver(Person... people){
        observes.addAll(Arrays.asList(people));
    }
    public void update(int newTemperature){
        currentTemperature = newTemperature;
        notifyObservers();
    }
    private void notifyObservers(){
        for (Person person:observes) {
            if(currentTemperature>person.getMaxTemperature()){
                person.updet(currentTemperature);
            }
        }
    }
}
