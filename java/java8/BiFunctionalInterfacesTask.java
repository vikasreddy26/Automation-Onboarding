package java8;

import org.testng.asserts.SoftAssert;

import java.util.HashMap;
import java.util.function.BiFunction;

public class BiFunctionalInterfacesTask {

    public static void main(String[] args) {

        BiFunction<String, Double, Product> biFunction = (a, b) -> {
            Product product = new Product(a, b);
            return product;
        };
        Product p = biFunction.apply("AC", 40000.0);
        System.out.println("BiFunction to Create the Product : " + p);

        HashMap<Integer, Product> cart = new HashMap();
        Product p1 = new Product("Fan", 1600, 2);
        Product p2 = new Product("TubeLight", 600, 2);
        Product p3 = new Product("TV", 20000, 2);
        cart.put(1, p1);
        cart.put(2, p2);
        cart.put(3, p3);
        Double costOfCart = 0.0;
        System.out.println("SHOPPING CART : ");
        for (Integer keys : cart.keySet()) {
            int quantity = cart.get(keys).getQuantity();
            Double price = cart.get(keys).getPrice();
            String name = cart.get(keys).getName();
            System.out.println("Product Name : " + name + " |  Price : " + price + " | Quantity : " + quantity);
            costOfCart += costOfCart().apply(price, quantity);
        }
        System.out.println("Total Cost : " + costOfCart);
    }

    public static BiFunction<Double, Integer, Double> costOfCart() {
        BiFunction<Double, Integer, Double> biFunction = (a, b) -> {
            return a * b;
        };
        return biFunction;
    }
}
