package com.syntax.class19;

public class Parent {
    String name="Misha";
    double money=100000;

    public static class Child extends Parent{



        void printInfo(){
            System.out.println("My ful name is Krystina"+name);
        }



        void buyCar(){
            System.out.println("I buy a car from papa"+money);
        }
    }
    public static void main(String[] args){

        Child child=new Child();
        child.printInfo();
        child.buyCar();



    }
}
