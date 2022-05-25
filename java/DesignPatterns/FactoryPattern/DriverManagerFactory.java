package DesignPatterns.FactoryPattern;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type) {
        DriverManager driverManager = null;
        switch (type) {
            case CHROME:
                driverManager = new MyChromeDriver();
                break;
            case FIREFOX:
                driverManager = new MyFirefoxDriver();
                break;
            case CHROMEWITHCAPABILITIES:
                driverManager = new MyChromeDriverWithCapabilities();
        }
        return driverManager;
    }


}