package Oops.PizzaShop;

public interface Pizza {
    public int standardBasePrice = 80;
    public int softBasePrice = 100;
    public int tomatosPrice = 20;
    public int cornPrice = 50;
    public int mushroomPrice = 70;
    public int pizzaPrice(boolean tomatos, boolean corn, boolean mushroom);
}
