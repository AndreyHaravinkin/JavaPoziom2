package pl.sda.javaPoziom2.wzorceProektowe.obserwer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Anna",17);
        Person p2 = new Person("Kuba",21);
        Person p3 = new Person("Andrzej",26);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        Weather weather = new Weather();

        weather.addObserver(p1,p2,p3);

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nPodaj temperature");
            int currentTemperature = scanner.nextInt();
            weather.update(currentTemperature);

            System.out.println();
        }
    }
}
