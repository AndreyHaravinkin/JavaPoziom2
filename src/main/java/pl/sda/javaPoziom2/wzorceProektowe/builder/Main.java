package pl.sda.javaPoziom2.wzorceProektowe.builder;

public class Main {
    public static void main(String[] args) {
        builder();
    }
    private  static void builder(){
        User user1 = new User.UserBuilder("Anna").lastname("Nowak").age(12).adress("Lodz").phone("1234").build();

        User user2 = new User.UserBuilder("Jan").lastname("Kowalski").build();

        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
