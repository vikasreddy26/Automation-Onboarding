package java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTask {

    public static void main(String[] args) {
        Product p1 = new Product("Fan",1600,"Electronics","A");
        Product p2 = new Product("TubeLight",600,"Electronics","A");
        Product p3 = new Product("TV",20000,"Electronics","A");
        Product p4 = new Product("NoteBook",40,"Stationary","A");
        Product p5 = new Product("Bulb",50,"Electronics","A");
        Product p6 = new Product("Switch",70,"Electronics","A");
        Product p7  = new Product("TextBook",200,"Stationary","A");
        Predicate<Product> priceCheck = (a)->a.price > 1000;
        ArrayList<Product> al = new ArrayList<>();
        al.add(p1);
        al.add(p4);
        al.add(p3);
        al.add(p2);
        al.add(p5);
        al.add(p6);
        al.add(p7);
        for(Product p:al){
            if(priceCheck.test(p)){
                System.out.println(p);
            }
        }
        System.out.println("************************************************************");
        Predicate<Product> categoryCheck = (a)->a.category.equals("Electronics");
        for(Product p:al){
            if(categoryCheck.test(p)){
                System.out.println(p);
            }
        }
        System.out.println("************************************************************");
        Predicate<Product>  pr = (a)->{
           return a.price >100 && a.category.equals("Electronics");
        };
        for(Product p:al){
            if(pr.test(p)){
                System.out.println(p);
            }
        }
        System.out.println("************************************************************");
        Predicate<Product>  pr1 = (a)->{
            return a.price >100 || a.category.equals("Electronics");
        };
        for(Product p:al){
            if(pr1.test(p)){
                System.out.println(p);
            }
        }
        System.out.println("************************************************************");
        Predicate<Product>  pr2 = (a)->{
            return a.price < 100 && a.category.equals("Electronics");
        };
        for(Product p:al){
            if(pr2.test(p)){
                System.out.println(p);
            }
        }
    }


}
