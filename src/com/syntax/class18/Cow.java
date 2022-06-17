package com.syntax.class18;

public class Cow {

    String breed;
    String color;
    int age;
    double weight;

    Cow(String breed, String color, int age, double weight){
       //When we have the same name variables as local and as instance inside a class
        //always local variables are preferred over instance variables by JAVA in block of code

        this.breed=breed;
        this.color=color;
        this.age=age;
        this.weight=weight;

    }

    String getCowInfo(){
        return "Breed "+breed+" Color "+color+" Age "+age+" Weight "+weight;
    }
}
