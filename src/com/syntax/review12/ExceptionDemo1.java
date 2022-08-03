package com.syntax.review12;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        System.out.println("1");
        doSomething();
        System.out.println("2");
    }


    public static void doSomething(){
        String name=null;
        name.length();
        System.out.println(10/0);
        int[] arr=new int[-5];
    }
}
