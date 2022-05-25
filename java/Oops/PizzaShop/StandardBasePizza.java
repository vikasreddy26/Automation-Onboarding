package Oops.PizzaShop;

public class StandardBasePizza implements Pizza {
    @Override
    public int pizzaPrice(boolean tomatos, boolean corn, boolean mushroom) {
        int pizzaCost = 0;
        if (tomatos && corn && mushroom) {
            pizzaCost = standardBasePrice + tomatosPrice + cornPrice + mushroomPrice;
        } else if (tomatos && !corn && !mushroom) {
            pizzaCost = standardBasePrice + tomatosPrice;
        } else if (!tomatos && corn && !mushroom ) {
            pizzaCost = standardBasePrice + cornPrice;
        } else if (!tomatos  && !corn && mushroom) {
            pizzaCost = standardBasePrice + mushroomPrice;
        } else if (tomatos && corn && !mushroom ) {
            pizzaCost = standardBasePrice + tomatosPrice + cornPrice;
        } else if (tomatos && !corn && mushroom) {
            pizzaCost = standardBasePrice + tomatosPrice + mushroomPrice;
        } else if (!tomatos && corn && mushroom) {
            pizzaCost = standardBasePrice + cornPrice + mushroomPrice;
        } else if (!tomatos && !corn && !mushroom) {
            pizzaCost = standardBasePrice;
        }
        return pizzaCost;
    }
}
