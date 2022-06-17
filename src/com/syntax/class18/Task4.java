package com.syntax.class18;

public class Task4 {

    //Write a java class that will have a constructor:
    // one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.
String pixel;
String apple;
public Task4(String googlePixel, String appleIphone){
    pixel=googlePixel;
    apple=appleIphone;
}public Task4() {
    System.out.println("Constructor with no parameters");
}
public void printPhone1(){
    System.out.println("Pixel:"+pixel);
}
public void printPhone2(){
    System.out.println("Apple:"+apple);
}
}
