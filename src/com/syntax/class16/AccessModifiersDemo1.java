package com.syntax.class16;

public class AccessModifiersDemo1 {

    private String password="pass123";
    int SSN=123546;
    String name="Maksym";

    public static void main(String[] args){
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
        System.out.println(ac.password);
        System.out.println(ac.name);
        System.out.println(ac.SSN);
    }



}
