package com.syntax.hometasks;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Person {

    //Create a Person class with following private fields: name, lastName, age, salary.
    //Variables should be initialized through constructor.
    //Inside the class also create a method to print user details.
    //In Test Class create a Map that will store key in ascending order.
    //In that map store personId and a Person Object. Print each object details.

    private String name;
    private String lastName;
    private int age;
    private int salary;


    Person(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    void userDetails() {
        System.out.println(name + " "+lastName + " Age: "+age +" Salary: " +salary);
    }

}
 class Test extends Person{
     Test(String name, String lastName, int age, int salary) {
         super(name, lastName, age, salary);
     }

     /**
      *
      */
     @Override
     void userDetails() {
         super.userDetails();
     }

     public static void main(String[] args) {

         Test person1=new Test("Maksym","Borodai",33,50000);
         Test person2=new Test("Oleg","Servylya",35,20000);
         Test person3=new Test("Slava","Dydka",61,99000);
         Test person4=new Test("Lena","LuPaZa",22,150000);



         TreeMap<Integer, Test> personalID = new TreeMap<>();
         personalID.put(44444, person1);
         personalID.put(11111,person2);
         personalID.put(22222,person3);
         personalID.put(33333,person4);

         Iterator<Entry<Integer, Test>> it = personalID.entrySet().iterator();
         while(it.hasNext()){
             Entry<Integer,Test> pair= it.next();

             System.out.println("Personal ID: "+pair.getKey());
             pair.getValue().userDetails();
         }



     }
 }
