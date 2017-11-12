package pl.sda.javaPoziom2.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {
     String name;
     double price;

    public Product(String nazwa, double cena) {
        this.name = nazwa;
        this.price = cena;
    }

    static String[] exempleName = new String[]{"Milk","Chleb","Shab","Banany","Cukierki"};

  //  static List<Product> example = new ArrayList<Product>(Arrays.asList(
          //  new Product("Milk", 5),
          //  new Product("Chleb", 3),
          //  new Product("Ogorek", 4),
          //  new Product("Olej", 6),
          //  new Product("Kelbasa", 11.45),
           // new Product("Shab", 16.50),
            //new Product("Ser", 22.35),
            //new Product("Jablka", 3.20),
            //new Product("Banany", 3.35),
            //new Product("Cukierki", 18.75)));


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
