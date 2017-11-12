package pl.sda.javaPoziom2.osoba;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Person> listOfEmployees = new ArrayList<Person>();

    public Company(String name) {
        this.name = name;
    }

    void addEmployees(Person first, Person... person) {
        System.out.println("Liczba osob do dodania " + (person.length + 1));

        listOfEmployees.add(first);

        for (int i = 0; i < person.length; i++) {
            listOfEmployees.add(person[i]);

        }
    }

    void showAllEmployees() {
        for (Person person : listOfEmployees) {
            System.out.println(String.format("%s %s (%s.l) - %s zL",
                    person.getSex(),
                    person.getName(),
                    person.getAge(),
                    person.getSalary()));
        }

    }

    void showEmplpoyeesSex(Sex sex){
        for (Person person : listOfEmployees) {
            if (person.getSex().equals(sex)){
                System.out.println(String.format("%s %s (%s.l) - %s zL",
                        person.getSex(),
                        person.getName(),
                        person.getAge(),
                        person.getSalary()));

            }

        }

    }

    void showEmployeesSalary(){
        int suma = 0;
        for (Person person: listOfEmployees) {
            suma+=person.getSalary();
            System.out.println("Srednaj pensja "+ suma/listOfEmployees.size());
        }
    }

    void podwyszka(int kwota){
        for (Person persona:listOfEmployees) {
         persona.setSalary(persona.getSalary()+kwota);
        }
    }
}
