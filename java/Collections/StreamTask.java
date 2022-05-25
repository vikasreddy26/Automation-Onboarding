package Collections;

import java8.Product;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamTask {

    public static void main(String[] args) {

        Product p1 = new Product("Fan",1600,"Electronics","A");
        Product p2 = new Product("TubeLight",600,"Electronics","A");
        Product p3 = new Product("TV",20000,"Electronics","A");
        Product p4 = new Product("NoteBook",40,"Stationary","A");
        Product p5 = new Product("Bulb",50,"Electronics","A");
        Product p6 = new Product("Switch",70,"Electronics","A");
        Product p7  = new Product("TextBook",200,"Stationary","A");
        ArrayList<Product> al = new ArrayList<>();
        al.add(p1);
        al.add(p4);
        al.add(p3);
        al.add(p2);
        al.add(p5);
        al.add(p6);
        al.add(p7);
        al.stream().filter(a->a.getPrice()>1000).collect(Collectors.toList()).forEach(s->System.out.println(s));
        System.out.println("**************** Printing all the products under Electronics *******************");
        al.stream().filter(a->a.getCategory().equals("Electronics")).collect(Collectors.toList()).forEach(s->System.out.println(s));
        System.out.println("**************** Count of Electronics *******************");
        long countOfElectronics = al.stream().filter(a -> a.getCategory().equals("Electronics")).count();
        System.out.println(countOfElectronics);
        System.out.println("**************** Printing all the products under Electronics and price greater than 1000  and updating names to Uppercase *******************");
        al.stream().filter(a -> a.getCategory().equals("Electronics") && a.getPrice() > 1000).map(a->a.getName().toUpperCase()).collect(Collectors.toList()).forEach(s->System.out.println(s));

    }
}
