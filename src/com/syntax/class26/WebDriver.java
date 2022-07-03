package com.syntax.class26;

public interface WebDriver {

    /*Create a WebDriver Interface that will have the following unimplemented behaviour:
    *openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    *Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
    */

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class ChromeDriver implements WebDriver{
    /**
     *
     */
    @Override
    public void openBrowser() {
        System.out.println("Chrome browser is opening");
    }

    /**
     *
     */
    @Override
    public void closeBrowser() {
        System.out.println("Chrome browser is closing");
    }

    /**
     *
     */
    @Override
    public void maximizeWindow() {
        System.out.println("Chrome browser is maximizing");
    }

    /**
     *
     */
    @Override
    public void findElement() {
        System.out.println("Finding elements in chrome");
    }
}

class FirefoxDriver implements WebDriver{
    /**
     *
     */
    @Override
    public void openBrowser() {
        System.out.println("Firefox browser is opening");
    }

    /**
     *
     */
    @Override
    public void closeBrowser() {
        System.out.println("Firefox browser is closing");
    }

    /**
     *
     */
    @Override
    public void maximizeWindow() {
        System.out.println("Firefox browser is maximizing");
    }

    /**
     *
     */
    @Override
    public void findElement() {
        System.out.println("Finding elements in firefox");
    }
}
class TestDriver {


    public static void main(String[] args) {
        //We can access the methods through defining an object of each class
        WebDriver webDriver = new ChromeDriver();
        webDriver.closeBrowser();
        webDriver.openBrowser();
        webDriver.findElement();
        webDriver.maximizeWindow();
        WebDriver webDriver1 = new FirefoxDriver();
        webDriver1.closeBrowser();
        webDriver1.openBrowser();
        webDriver1.findElement();
        webDriver1.maximizeWindow();

        WebDriver[] webDrivers = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver driver : webDrivers) {
            driver.openBrowser();
            driver.closeBrowser();
            driver.maximizeWindow();
            driver.findElement();
        }
    }
}
