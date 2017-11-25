package pl.sda.javaPoziom2.wzorceProektowe.singleton;

public class Main {
    public static void main(String[] args) {
        DataBase db1 = DataBase.getInstans();
        db1.saveDate("Adam");
        db1.saveDate("Kuba");

        db1.show();

        DataBase db2 = DataBase.getInstans();
        db2.saveDate("Ola");
        db2.saveDate("Ela");

        db1.show();
        db2.show();

    }
}
