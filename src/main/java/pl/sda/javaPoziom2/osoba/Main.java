package pl.sda.javaPoziom2.osoba;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("SDA");

        Person p1 = new Person("Anna", 23, 2000, Sex.FAMELY);
        Person p2 = new Person("Kuba", 30, 1500,Sex.MALE );
        Person p3 = new Person("Jan", 31, 7000,Sex.MALE );

        company.addEmployees(p1,p2,p3);
        company.showAllEmployees();
     //   company.showEmplpoyeesSex(Sex.MALE);
      //  company.showEmployeesSalary();
        company.podwyszka(10);
    }
}
