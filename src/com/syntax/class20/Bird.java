package com.syntax.class20;

public class Bird {

    String name;
    String color;
    int age;
    double weight;
void printInfo(){
    System.out.println("Name "+name+" Color "+color);
}



     Bird(String name, String color, int age, double weight) {
    this.age=age;
    this.name=name;
    this.color=color;
    this.weight=weight;
    }
}


class Parrot extends Bird{
    Parrot (String name, String color, int age, double weight) {
        super(name, color, age, weight);//calling the parent class constructor by writing the super();
       /* this.name=name;
        this.age=age;
        this.color=color;
        this.weight=weight;

        */
    }
}
class Sparrow extends Bird {
    Sparrow(String name, String color, int age, double weight) {
        super(name, color, age, weight);


    }
}