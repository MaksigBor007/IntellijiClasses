package com.syntax.class19;

public class dogTester {

    public static void main(String [] args){
        Cat cat=new Cat("kity","black");
        cat.printInfo();//Cat class does not have this method because we are using
                       // inheritance we can use the methods from the parent class
        dog dog=new dog("Max","white");
        dog.printInfo();


    }
}
