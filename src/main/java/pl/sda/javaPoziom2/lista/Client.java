package pl.sda.javaPoziom2.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Client {
    String name;
    private List<Product> listOfProducts = new ArrayList<Product>();

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client(String name) {
        this.name = name;
        addRandomProducts();
    }

    private void addRandomProducts() {
        Random r = new Random();
        int listSize = r.nextInt(5) + 1;
        for (int i = 0; i < r.nextInt(5) + 1; i++) {
            listOfProducts.add(new Product(Product.exempleName[r.nextInt(Product.exempleName.length)], r.nextDouble() * r.nextInt(100)));
        }
    }

    void printList() {
        System.out.println("Zakupy klienta: " + name);
        for (Product product : listOfProducts) {
            System.out.println(String.format("%s-%.2f zl", product.getName(), product.getPrice()));

        }
        // System.out.println(String.format("Imie: %s", name));
        // System.out.printf("Imie: %s\n",name);

        System.out.println("======================");

    }
}
