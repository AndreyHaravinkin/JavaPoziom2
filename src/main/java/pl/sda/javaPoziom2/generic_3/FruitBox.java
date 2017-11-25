package pl.sda.javaPoziom2.generic_3;
/*
 T- type
 K - klucz
 V - wartosc
 E - element(np. kolekcji)
 N - liczba
 */

import pl.sda.javaPoziom2.without_1.Apple;

public class FruitBox<T> {
    private T fruit;

    public FruitBox(T fruit) {
        this.fruit = fruit;
    }

    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }
}