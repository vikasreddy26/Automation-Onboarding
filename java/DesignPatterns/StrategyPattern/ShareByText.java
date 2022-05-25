package DesignPatterns.StrategyPattern;

public class ShareByText implements Share {
    @Override
    public void share() {
        System.out.println("share by text");
    }
}
