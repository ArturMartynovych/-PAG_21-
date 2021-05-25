package zad3_4;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our shop!" + "\n");

        //Products

        Product banan = new Product("Banan", 5);
        Product ananas = new Product("ananas", 3);
        Product buty = new Product("buty", 7);
        Product mieso = new Product("mięso", 9);
        Product sluchawki = new Product("sluchawki", 999);
        Product slon = new Product("słon", 25);
        Product kiwi = new Product("kiwi", 3);
        Product kawusia = new Product("kawusia", 7);
        Product herbata = new Product("herbata", 1.2);
        Product labuteny = new Product("labuteny", 9);


        //List of products

        List<String> listOfProducts = Collections.singletonList(banan + "\n" + ananas + "\n" + buty + "\n" + mieso +
                "\n" + sluchawki + "\n" + slon + "\n" + kiwi + "\n" + kawusia + "\n" + herbata + "\n" + labuteny + "\n");
        System.out.println("Our products are:" + "\n" + listOfProducts);

        // List of customers
        Klient Vova = new Klient("Volodymyr", "Bojko");
        Koszyk koszyk1 = new Koszyk();
        koszyk1.addProduct(banan, 10);
        koszyk1.addProduct(ananas, 2);
        Vova.setKoszyk(koszyk1);
        Vova.hi();
        koszyk1.showAll(koszyk1);
        System.out.println("\n" + "Price of the basket: " + koszyk1.getSum() + " zł");

        Klient Maks = new Klient("Maksym", "Dąbrowski");
        Koszyk koszyk2 = new Koszyk();
        koszyk2.addProduct(buty, 10);
        koszyk2.addProduct(mieso, 2);
        Maks.setKoszyk(koszyk2);
        Maks.hi();
        koszyk2.showAll(koszyk2);
        System.out.println("\n" + "Price of the basket: " + koszyk2.getSum() + " zł");

        Klient Bagdat = new Klient("Budun", "Bulhakow");
        Koszyk koszyk3 = new Koszyk();
        koszyk3.addProduct(sluchawki, 3);
        koszyk3.addProduct(kawusia, 8);
        koszyk3.addProduct(labuteny, 1);
        Bagdat.setKoszyk(koszyk3);
        Bagdat.hi();
        koszyk3.showAll(koszyk3);
        System.out.println("\n" + "Price of the basket: " + koszyk3.getSum() + " zł");

        List<String> Clients = Collections.singletonList(Vova + "\n" + Maks + "\n" + Bagdat);
        System.out.println("Our Clients are: " + "\n" + Clients + "\n");


        Queue<Klient> queue = new LinkedList<>();
        queue.add(Vova);
        queue.add(Maks);
        queue.add(Bagdat);

        System.out.println(queue);

        Klient m = queue.peek();
        System.out.println(m);

    }
}
