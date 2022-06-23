package com.syntax.class21;

class Cars {

    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    Cars(String make, String model, int numberOfDoors, int topSpeed, double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
    Cars(String make, String model,int topSpeed, double price){
        numberOfDoors=4;
        this.make=make;
        this.model=model;
        this.topSpeed=topSpeed;
        this.price=price;

    }
    Cars(int numberOfDoors,int topSpeed,double price){
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
        make="unknown";
        model="unknown";
    }
    Cars(String make, String model, int numberOfDoors ){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        topSpeed=90;
        price=0;
    }
    void displayMethod(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }
}
class CarsTester{
    public static void main(String[] args){
        Cars car=new Cars("Toyota","Prius",120,30000.0);
        car.displayMethod();
        Cars car2=new Cars("Toyota","Prius",120,30000.0);
        car2.displayMethod();
        Cars car3=new Cars(4,120,30000.0);
        car3.displayMethod();
        Cars car4=new Cars("Toyota","Prius",4);
        car4.displayMethod();

    }
}
