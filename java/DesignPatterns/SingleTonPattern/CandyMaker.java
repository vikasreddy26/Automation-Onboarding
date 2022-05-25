package DesignPatterns.SingleTonPattern;

public class CandyMaker {
    private boolean empty;
    private boolean boiled;

    private static CandyMaker candyMaker;

    //This code is only started when the boiler is empty
    private CandyMaker() {
        empty = true;
        boiled = false;
    }

    public static synchronized CandyMaker getInstance() {
        if (candyMaker == null) {
            candyMaker = new CandyMaker();
        }
        return candyMaker;
    }

    //to fill the boiler it must be empty, and once its full,
    //we set the empty and boiled flags
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the candyMaker with milk and choclate mix
        }
    }

    //To drain the boiler, it must be full(non-empty) and also boiled.
    //once it is drained, we set the empty back to true
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    //to boil the mixture the boiler has to be full and not already boiled.
    //once its boiled we set the boiled flag to true
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the content to boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
