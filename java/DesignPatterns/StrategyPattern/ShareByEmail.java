package DesignPatterns.StrategyPattern;

public class ShareByEmail implements Share {
    @Override
    public void share() {
        System.out.println("Share By Email");
    }
}
