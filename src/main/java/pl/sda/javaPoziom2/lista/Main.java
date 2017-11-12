package pl.sda.javaPoziom2.lista;

public class Main {
    public static void main(String[] args) {
       // Shop shop = new Shop();
      //  Company company = new Company();
      //  Counter counter = new Counter();
        Regex regex = new Regex();

       // Client c1 = new Client("Anna");
       // c1.printList();
      //  Client c2 = new Client("Kuba");
      //  c2.printList();
      //  Client c3 = new Client("Bartosz");
     //   c3.printList();

       // shop.addToQueue(c1,c2,c3);
      //  shop.startService();

      //  company.addEmployees();
        //company.shouAllKeys();
       // company.shouAllNames();
       // company.getEmployee(243);
      //  company.shouAllEmployees();

        //counter.countWords();
       // regex.match("http://www.wp.pl","^https?://(www)?([a-z]+.)+[a-z]+");
      //  regex.match("http://www.poczta.onet.pl","^https?://(www)?([a-z]+.)+[a-z]+");
        regex.match("lukaszmalek90@gmail.com","^[a-z0-9_.-]+@([a-z]+.)+[a-z]+");

    }

}
