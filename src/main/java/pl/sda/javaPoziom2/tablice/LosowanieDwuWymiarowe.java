package pl.sda.javaPoziom2.tablice;

import java.util.Random;
import java.util.Scanner;

public class LosowanieDwuWymiarowe {

    private int length;
    private int height;
    private int[][] array;

    public LosowanieDwuWymiarowe(int length, int height) {
        this.length = length;
        this.height = height;
        array = new int[length][height];
    }

    void fillTable(int min, int max) {
        Random random = new Random();
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < height; column++) {
                array[row][column] = random.nextInt(max - min + 1) + min;
            }
        }

    }

    void show() {
        for (int row = 0; row < length; row++) {
            for (int colum = 0; colum < height; colum++) {
                System.out.print(array[row][colum] + "\t ");
            }
            System.out.println();
        }
    }

    void showRow(int id) {
        for (int column = 0; column < height; column++) {
            System.out.print(array[id][column] + "\t");
        }
    }

    void showColumn(int id) {
        for (int row = 0; row < length; row++) {
            System.out.println(array[row][id] + "\t");
        }
    }

    void suma() {
        int[] temp = new int[height];
        for (int row = 0; row < length; row++) {
            int suma = 0;
            for (int column = 0; column < height; column++) {
                System.out.print(array[row][column] + "\t");
                suma += array[row][column];

                temp[column] += array[row][column];
            }
            System.out.println("|\t" + suma);
        }
        for (int column = 0; column < height + 2; column++) {
            if (column == height) {
                System.out.print("+\t");
            } else {
                System.out.print("--\t");
            }
        }
        System.out.println();

        int sum = 0;
        for (int column = 0; column < height; column++) {
            System.out.print(temp[column] + "\t");
            sum += temp[column];
        }
        System.out.println("|\t" + sum);
    }

}
