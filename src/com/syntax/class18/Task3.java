package com.syntax.class18;

public class Task3 {

    //Create a method that will accept a String as a parameter and return a new String
    // that consist only of vowels. Method should be available inside the class
    // only where it was declared and executed by calling it is name.

    String b="";
   private String name(String vow) {
        for (int i = 0; i < vow.length(); i++) {
            if ('a' == vow.charAt(i) || 'e' == vow.charAt(i) || 'i' == vow.charAt(i) || 'u' == vow.charAt(i) || 'o'==vow.charAt(i)) {
                b+=vow.charAt(i);
            }
        }
        return b;
    }
    public static void main(String [] args){
    Task3 t3=new Task3();
        System.out.println(t3.name("appreciation"));


    }
}