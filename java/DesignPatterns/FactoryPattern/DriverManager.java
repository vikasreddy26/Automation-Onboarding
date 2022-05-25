package DesignPatterns.FactoryPattern;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    WebDriver driver;

    public abstract WebDriver getDriver();

}
