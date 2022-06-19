package com.syntax.class19;

public class HumanTester extends Human{

    boolean goodWithJava;
    HumanTester(String name, String eyeColor, String job, int age, double weight, boolean goodWithJava) {
        this.name = name;
        this.job = job;
        this.eyeColor = eyeColor;
        this.age = age;
        this.weight = weight;
        this.goodWithJava=goodWithJava;
    }
void printInfo(){
    System.out.println("My name is "+name+" I do "+job+" I am good with Java"+" "+goodWithJava);

        }
        public static void main(String[] args){
        HumanTester ht=new HumanTester("maks","browm","Gym",30,30.88,true);
        ht.printInfo();
    }

    }

