package com.syntax.class15;

public class VariablesDemo2 {
    String breed; //instance
    static int num=5; // static

    void printName(){
        String name="Local"; // local variable
        System.out.println(name);
    }

    static void printName2(){
        String name="Local"; // local variable
        System.out.println(name);
    }

    public static void main(String[] args) {
        VariablesDemo2 v = new VariablesDemo2();
        v.printName();
        System.out.println(VariablesDemo2.num);
        VariablesDemo2.printName2();


    }

}
