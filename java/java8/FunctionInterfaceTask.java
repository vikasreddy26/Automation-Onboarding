package java8;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionInterfaceTask {


    public static void main(String[] args) {
        Product p1 = new Product("Fan", 1600, "Electronics", "A");
        Product p2 = new Product("TubeLight", 600, "Electronics", "A");
        Product p3 = new Product("TV", 20000, "Electronics", "A");
        Product p4 = new Product("NoteBook", 40, "Stationary", "A");
        Product p5 = new Product("Bulb", 50, "Electronics", "A");
        Product p6 = new Product("Switch", 70, "Electronics", "A");
        Product p7 = new Product("TextBook", 200, "Stationary", "A");
        ArrayList<Product> al = new ArrayList<>();
        al.add(p1);
        al.add(p4);
        al.add(p3);
        al.add(p2);
        al.add(p5);
        al.add(p6);
        al.add(p7);

        double totalCost = 0;
        for (int i = 0; i <= al.size() - 1; i++) {
            totalCost += totalcostOfAllProducts().apply(al.get(i));
        }
        System.out.println("Total Cost Of All Products : "+totalCost);

        double costGreaterThanThousand = 0;
        for (int i = 0; i <= al.size() - 1; i++) {
            costGreaterThanThousand += greaterThanThousand().apply(al.get(i));
        }
        System.out.println("Total cost of products Greater than 1000 : "+ costGreaterThanThousand);

        double costOfElectronicProducts =0;

        for (int i = 0; i <= al.size() - 1; i++) {
            costOfElectronicProducts += costOfElectronicProducts().apply(al.get(i));
        }
        System.out.println("Total Cost of Electronics : "+costOfElectronicProducts);

           for (int i = 0; i <= al.size() - 1; i++) {
               if(getProductsOfElectronicsGreaterThanThousand().apply(al.get(i))!=null){
                   System.out.println(al.get(i));
               }
        }
    }
    public static Function<Product, Double> greaterThanThousand() {
        Function<Product, Double> function = (p) -> {
            double sum = 0;
            if (p.getPrice() > 1000) {
                sum = sum + p.getPrice();
            }
            return sum;
        };
        return function;
    }
    public static Function<Product, Double> costOfElectronicProducts(){
        Function<Product, Double> function = (p) -> {
            double sum = 0;
            if (p.getCategory().equals("Electronics")) {
                sum = sum + p.getPrice();
            }
            return sum;
        };
        return function;
    }

    public static Function<Product, Product> getProductsOfElectronicsGreaterThanThousand(){
        Function<Product,Product> function = (p) -> {
            Product product = null;
            if(p.getPrice()>1000 && p.getCategory().equals("Electronics")){
                product = p;
            }
            return product;
        };
        return function;
    }
    public static Function<Product, Double> totalcostOfAllProducts(){
        Function<Product, Double> function = (p) -> {
            double sum = 0;
            sum = sum + p.getPrice();
            return sum;
        };
        return function;
    }
}
