package DesignPatterns.BuilderPattern;

public class Customer {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle.BicycleBuilder().carrier(true).doubleseats(true).doublestands(true).getBicycle();
        System.out.println(bicycle);
    }
}
