package com.syntax.class16;

public class Dog{
    String name;

    String color;
static int noOfLegs=4;

    public static void main(String[] args){

        Dog dog1=new Dog();//creating an object of Dog class
        dog1.name="Rocky";
        dog1.color="Brouwn";


        Dog dog2=new Dog();
        dog2.name="Bakl";
        dog2.color="White";

        Dog dog3=new Dog();
        dog3.name="Jaja";
        dog3.color="Black&White";

        System.out.println(dog1.name);
        System.out.println(dog2.name);
        System.out.println(dog3.name);
    }


        }
