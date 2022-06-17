package com.syntax.class18;

import static java.lang.System.*;

public class Task2 {
    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.

public String rev(String b) {
    StringBuilder newStr=new StringBuilder(b);
    newStr=newStr.reverse();
return newStr.toString();
    }

public static void main(String [] args){
      Task2 t2=new Task2();
    System.out.println(t2.rev("Hello") );

}

}
