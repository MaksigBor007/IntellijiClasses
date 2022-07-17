package com.syntax.ArrayListHomeTasks;



import java.util.ArrayList;

public class Task6 {

    /*Create a class Insurance that will have an attribute as insuranceName and unimplemented
 behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health.
Car class has it's own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.*/


}

abstract class Insurance{
    String insuranceName;
    abstract void getQuote();
    abstract void cancelInsurance();


}
class Car extends Insurance{
    void carModel(){

    }

    /**
     *
     */
    @Override
    void getQuote() {

    }

    /**
     *
     */
    @Override
    void cancelInsurance() {

    }
}
class Pet extends Insurance{
    void petType(){

    }
    /**
     *
     */
    @Override
    void getQuote() {

    }

    /**
     *
     */
    @Override
    void cancelInsurance() {

    }
}
class Health extends Insurance {
    /**
     *
     */
    @Override
    void getQuote() {

    }

    /**
     *
     */
    @Override
    void cancelInsurance() {

    }

    public static void main(String[] args) {
           Car car=new Car();
           Pet pet=new Pet();
           Health health = new Health();

        ArrayList<Insurance> num=new ArrayList<>();
        num.add(car);
        num.add(pet);
        num.add(health);
        for(Insurance in:num){
            in.getQuote();
            in.cancelInsurance();

        }
        System.out.println(num);



    }
}