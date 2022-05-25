package Oops.bouquet;

public class Bouquet  extends Flowers {

    public void costOfBouquet(int roses, int jasmine, int lily) {
        double rosescost = getRosesCost() * roses;
        double jasminesCost = getJasminesCost() * jasmine;
        double lilysCost = getLilysCost() * lily;
        double bouquetCost = rosescost + jasminesCost + lilysCost;
        System.out.println("Cost of the bouquet is :: " + bouquetCost + "$");
    }

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.costOfBouquet(10, 3, 3);
        bouquet.costOfBouquet(10, 60, 90);
    }


}
