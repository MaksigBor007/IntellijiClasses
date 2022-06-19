package com.syntax.class20;

public class BirdTester {

    public static void main(String [] args){

        Parrot parrot=new Parrot("parrot","Black",10,.5);
        parrot.printInfo();

        Sparrow sparrow=new Sparrow("sparrow","White",2,1.0);
        sparrow.printInfo();
    }
}
