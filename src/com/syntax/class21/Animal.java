package com.syntax.class21;


public class Animal {

    String name;
    String color;
    String breed;

    int age;

    public Animal(String name,String color, String breed, int age){
        this.age=age;
        this.color=color;
        this.name=name;
        this.breed=breed;

    }
    void printInfo(){
        System.out.println("Name "+name+" color "+color+" breed "+breed+" age "+age);
    }
}
class Dog extends Animal {
    public Dog(String name, String color, String breed, int age) {
        super(name, color, breed, age);
    }

    class Cat extends Animal {

        public Cat(String name, String color, String breed, int age) {
            super(name, color, breed, age);
        }
    }
    }
