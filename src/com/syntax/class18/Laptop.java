package com.syntax.class18;

public class Laptop {

    String make;
    String model;
    String storage;
    String memory;
    double screenSize;

    public Laptop(){
    System.out.println("Basic construction is happening....");
}

    public Laptop(String make) {
        this.make = make;
    }

    public Laptop(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Laptop(String make, String model, String storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public Laptop(String make, String model, String storage, String memory) {
        this.make = make;
        this.model = model;
        this.storage = storage;
        this.memory = memory;
    }

    public Laptop(String make, String model, String storage, String memory, double screenSize) {
       /* this.make = make;
        this.model = model;
        this.storage = storage;
        this.memory = memory;*/
        this(make,model,storage,memory); //using this() to avoid iteration
        this.screenSize = screenSize;
    }

    public static void main(String[] args){
        Laptop lp=new Laptop("Google","Pixel 4a5G","128Gb","8",5.2);
        System.out.println(lp.make+" "+lp.model+" "+lp.storage+" "+lp.memory+" "+lp.screenSize);

    }
}
