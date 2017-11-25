package pl.sda.javaPoziom2.without_1;

import pl.sda.javaPoziom2.bigger_fruit_box_4.BiggerFruitBox;
import pl.sda.javaPoziom2.generic_3.FruitBox;
import pl.sda.javaPoziom2.generic_extends_5.*;
import pl.sda.javaPoziom2.generic_methods_6.VoidMethods;
import pl.sda.javaPoziom2.simple_2.SimpleFruitBox;

public class Main {
    public static void main(String[] args) {
       // without_1();
       // simple_2();
      //  generic_3();
      //  bigger_fruit_box_4();
       // generec_extends();
        generic_method_6();
        generic_return_6();
    }

    private static void generic_return_6() {
        
    }

    private static void generic_method_6() {

      //  ShapeBox<Rectangle> box1 = new ShapeBox<>(new Rectangle()); //BLAND
      //  ShapeBox<Rectangle> box1b = new ShapeBox<>(new Square()); //BLAND

        ShapeBox<Circle> box1c = new ShapeBox<>(new Circle());

        VoidMethods.method1(box1c);

        /*******************************/

        ShapeBox<Rectangle> box2a = new ShapeBox<>(new Rectangle()); //ok
        ShapeBox<Square> box2b = new ShapeBox<>(new Square()); //ok

        VoidMethods.method2(box2a);

        /******************************/
        ShapeBox<Rectangle> box3a = new ShapeBox<>(new Rectangle());
        ShapeBox<Square> box3b = new ShapeBox<>(new Square());
        ShapeBox<Circle> box3c = new ShapeBox<>(new Circle());

        VoidMethods.method3(box3a);

        /**************************************/

        ShapeBox<Square>box5a = new ShapeBox<>(new Square());
        ShapeBox<Rectangle>box5b = new ShapeBox<>(new Rectangle());
        ShapeBox<Circle>box5c = new ShapeBox<>(new Circle());

        VoidMethods.method5(box5b);

    }

    private static void generec_extends() {
        ShapeBox<Circle> shapeBox = new ShapeBox<>(new Circle());
        ShapeBox<Rectangle> shapeBox2 = new ShapeBox<>(new Rectangle());

        // Nie moge tak zrobic

     //   ShapeBox<String> shapeBox3 = new ShapeBox<String>("aaa");

       // System.out.println(shapeBox.getNameOfShape());
       // shapeBox.getShape().hello();

        ShapeBox<Square> shapeBox3 = new ShapeBox<>(new Square());
        System.out.println(shapeBox3.getShape().getName());
    }

    private static void bigger_fruit_box_4() {
        BiggerFruitBox<Apple, Orang> biggerFruitBox = new BiggerFruitBox<Apple, Orang>(new Apple(), new Orang());

        System.out.printf("Pierwszy: %s, Drugi: %s\n\n", biggerFruitBox.getFirst().getClass().getSimpleName(),
                biggerFruitBox.getSecond().getClass().getSimpleName());


        BiggerFruitBox<String, Float> biggerFruitBox2 = new BiggerFruitBox<String, Float>("ABCDEFG",2.0f);

        System.out.printf("Pierwszy: %s, Drugi: %s", biggerFruitBox2.getFirst().getClass().getSimpleName(),
                biggerFruitBox2.getSecond().getClass().getSimpleName());


    }


    private static void generic_3() {
        FruitBox<Apple> appleFruitBox = new FruitBox<Apple>(new Apple());
        System.out.println(appleFruitBox.getFruit().getClass().getSimpleName());

        Apple apple = new Apple();
        appleFruitBox.setFruit(new Apple());
        System.out.println(appleFruitBox.getFruit().getClass().getSimpleName());

        FruitBox<Orang> orangFruitBox = new FruitBox<Orang>(new Orang());
        System.out.println(orangFruitBox.getFruit().getClass().getSimpleName());

        FruitBox<String> stringFruitBox = new FruitBox<String>("AAA");
        System.out.println(stringFruitBox.getFruit().getClass().getSimpleName());

    }

    private static void simple_2(){
        SimpleFruitBox simpleFruitBox = new SimpleFruitBox(new Orang());
        System.out.println(simpleFruitBox.getFruit().getClass().getSimpleName());

        simpleFruitBox.setFruit(new Apple());
        System.out.println(simpleFruitBox.getFruit().getClass().getSimpleName());

        simpleFruitBox.setFruit(new String());
        simpleFruitBox.setFruit(true);
        System.out.println(simpleFruitBox.getFruit().getClass().getSimpleName());
    }
    private static void without_1(){
        AppleBox appleBox = new AppleBox(new Apple());
        OrangBox orangBox = new OrangBox(new Orang());
    }
}
