package com.syntax.class23;

public class WebDriver {

    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openURL(String urL){
        System.out.println("openning"+urL);
    }
    public void testLoginPage(){
        System.out.println("checking if login page is visible");
    }
    public void closeBrowser(){
        System.out.println("closing the browser");
    }
}
class Chrome extends WebDriver{
    /**
     *
     */
    @Override
    public void startBrowser() {
        System.out.println("openning Google Chrome");
    }

    /**
     * @param urL
     */
    @Override
    public void openURL(String urL) {
        System.out.println("opening the URL"+urL+" on Google Chrome");
    }

    /**
     *
     */
    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on google chrome");
    }

    /**
     *
     */
    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}
class Safari extends WebDriver{
    /**
     *
     */
    @Override
    public void startBrowser() {
        System.out.println("openning Google in Safari");
    }

    /**
     * @param urL
     */
    @Override
    public void openURL(String urL) {
        String url="";
        System.out.println("opening the URL"+url+" on Safari");
    }

    /**
     *
     */
    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on google Safari");
    }

    /**
     *
     */
    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Safari");
    }
}
class FireFox extends WebDriver{
    /**
     *
     */
    @Override
    public void startBrowser() {
        System.out.println("openning Google in FireFox");
    }

    /**
     * @param urL
     */
    @Override
    public void openURL(String urL) {
        System.out.println("opening the URL"+urL+" on FireFox");
    }

    /**
     *
     */
    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on google FireFox");
    }

    /**
     *
     */
    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google FireFox");
    }
}
class Edge extends WebDriver{
    /**
     *
     */
    @Override
    public void startBrowser() {
        System.out.println("openning Google in Edge");
    }

    /**
     * @param urL
     */
    @Override
    public void openURL(String urL) {
        System.out.println("opening the URL"+urL+" on Edge");
    }

    /**
     *
     */
    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on google Edge");
    }

    /**
     *
     */
    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Edge");
    }
}