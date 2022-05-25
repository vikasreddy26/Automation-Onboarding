package Oops.PizzaShop;

public class SoftBasePizza implements Pizza{

    @Override
    public int pizzaPrice(boolean tomatos, boolean corn, boolean mushroom) {
        int pizzaCost = 0;
        if (tomatos && corn && mushroom) {
            pizzaCost = softBasePrice + tomatosPrice + cornPrice + mushroomPrice;
        } else if (tomatos && !corn&& !mushroom ) {
            pizzaCost = softBasePrice + tomatosPrice;
        } else if (!tomatos  && corn && !mushroom ) {
            pizzaCost = softBasePrice + cornPrice;
        } else if (!tomatos && !corn  && mushroom) {
            pizzaCost = softBasePrice + mushroomPrice;
        } else if (tomatos && corn && !mushroom ) {
            pizzaCost = softBasePrice + tomatosPrice + cornPrice;
        } else if (tomatos && !corn  && mushroom) {
            pizzaCost = softBasePrice + tomatosPrice + mushroomPrice;
        } else if (!tomatos  && corn && mushroom) {
            pizzaCost = softBasePrice + cornPrice + mushroomPrice;
        }else if (!tomatos&& !corn && !mushroom) {
            pizzaCost = softBasePrice;
        }
        return pizzaCost;
    }
}
