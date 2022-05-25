package DesignPatterns.FactoryPattern;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FactoryPatternTest {
    DriverManager driverManager;
    WebDriver driver;

    @Test
    public void test(){
        driverManager  = DriverManagerFactory.getManager(DriverType.CHROMEWITHCAPABILITIES);
        driver = driverManager.getDriver();
        driver.get("http://www.amazon.com/");
        String title= driver.getTitle();
        System.out.println(title);
        driver.quit();
    }

}
