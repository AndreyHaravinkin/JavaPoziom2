package pl.sda.javaPoziom2.Prostokat;

import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Prostokat {
    private int length, width;

    void readSize() {
        Scanner scanner = new Scanner(System.in);
        while (length<=0) {
            System.out.println("Length: ");
            length = scanner.nextInt();
        }
        while (width<=0) {
            System.out.println("Width: ");
            width = scanner.nextInt();
        }


    }

    void readSize(int length, int width){
        this.length = length;
        this.width = width;
    }

    void print(){
        print("*");
    }
    void print(String znak){
        for (int i = 0; i < width; i++) {
            for (int j = 0; j <length ; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }
}
