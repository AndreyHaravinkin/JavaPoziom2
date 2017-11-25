package pl.sda.javaPoziom2.generic_extends_5;

public interface Shape {
    String getName();
    default void hello(){
        System.out.println("Hello, I am Shape");
    }
}
