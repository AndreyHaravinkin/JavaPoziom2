package pl.sda.javaPoziom2.generic_methods_6;

import pl.sda.javaPoziom2.generic_extends_5.Circle;
import pl.sda.javaPoziom2.generic_extends_5.Rectangle;
import pl.sda.javaPoziom2.generic_extends_5.Shape;
import pl.sda.javaPoziom2.generic_extends_5.ShapeBox;

public class VoidMethods {

    public static void method1(ShapeBox<Circle> box){
        System.out.println("Inside1: " + box.getNameOfShape());
    }

    public static void method2(ShapeBox<?> box){
        System.out.println("Inside2: " + box.getShape().getName());
    }

    public static void method3(ShapeBox<? extends Rectangle> box){
        System.out.println("Inside3: " + box.getShape().getName());
    }

    public static void method4(ShapeBox<? extends Shape> box){
        System.out.println("Inside4: " + box.getShape().getName());

    }

    public static void method5(ShapeBox<? super Rectangle> box){
        System.out.println("Inside5: " + box.getShape().getName());
    }
}
