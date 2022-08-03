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

    @Override            //use toString method instead of void PrintAll
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
 class Test extends Person{
     Test(String name, String lastName, int age, int salary) {
         super(name, lastName, age, salary);
     }

     /**
      *
      */


     public static void main(String[] args) {

         TreeMap<Integer, Test> personalID = new TreeMap<>();
         personalID.put(44444, new Test("Maksym","Borodai",33,50000));
         personalID.put(11111,new Test("Petya","Lupkin",45,60000));
         personalID.put(22222,new Test("Lena","LuPaZa",22,99000));
         personalID.put(33333,new Test("Kirill","Borodai",30,49000));

         for (Person p: personalID.values()) {
             System.out.println(p);
         }



     }
 }
