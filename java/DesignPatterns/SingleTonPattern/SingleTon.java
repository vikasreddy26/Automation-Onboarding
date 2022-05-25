package DesignPatterns.SingleTonPattern;

public class SingleTon {
    public static void main(String[] args) {
        CandyMaker instance1 = CandyMaker.getInstance();
        CandyMaker instance2 = CandyMaker.getInstance();
        System.out.println(instance1.isBoiled());
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);
    }
}
