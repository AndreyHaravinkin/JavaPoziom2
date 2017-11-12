package pl.sda.javaPoziom2.lista;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Shop {
    private Queue<Client> clientQueue = new LinkedList<Client>();


    void addToQueue(Client... clients) {
        for (Client client : clients) {
            System.out.println("Do kolejki dodano: " + client.getName());
            clientQueue.offer(client);
        }

    }

    public void startService() {
        Random random = new Random();
        double income = 0;
        System.out.println("Liczba klientow PRZED: " + clientQueue.size());
        while (!clientQueue.isEmpty()) {
            Client client = clientQueue.poll();
            System.out.println(client.getName());

            Iterator<Product> it = client.getListOfProducts().iterator();

            while (it.hasNext()) {
                Product product = it.next();
                System.out.printf("   - %s %.2f\n", product.getName(), product.getPrice());
                income += product.getPrice();
                it.remove();


              //  try {
               //     Thread.sleep(random.nextInt(2000));
               // }catch (InterruptedException e){
                //    e.printStackTrace();
               // }
            }
            System.out.println();

        }
        System.out.println("Liczba klientow PO: " + clientQueue.size());
        System.out.printf("Sklep zarobil: %.2f zl", income);
    }
}
