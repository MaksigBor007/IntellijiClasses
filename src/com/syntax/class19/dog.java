package com.syntax.class19;

class Animal {
    String name;
    String breed;
    String color;
    int age;
    dog weight;
    void printInfo(){
        System.out.println("Name "+name+" Color "+color);
    }

}
public class dog extends Animal{
    dog(String name,String color){
        this.name=name;//using extends keyword we are able to access the name field from the animal class
        this.color=color;
    }


}
class Cat extends Animal{
Cat(String name, String color){
    this.name=name;
    this.color=color;
}

}