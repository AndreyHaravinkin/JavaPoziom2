package pl.sda.javaPoziom2.tablice;

public class Main {
    public static void main(String[] args) {
        LosowanieDwuWymiarowe losowanieDwuWymiarowe = new LosowanieDwuWymiarowe(3, 5);

        // losowanieDwuWymiarowe.show();
        losowanieDwuWymiarowe.fillTable(1, 5);

        //  System.out.println();

        // losowanieDwuWymiarowe.show();

        //   System.out.println();

        // losowanieDwuWymiarowe.showRow(1);

        //   System.out.println();

        // losowanieDwuWymiarowe.showColumn(0);

        System.out.println();

        losowanieDwuWymiarowe.suma();
    }
}
