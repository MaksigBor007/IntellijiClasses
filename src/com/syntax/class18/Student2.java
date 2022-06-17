package com.syntax.class18;

public class Student2 {
    //Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.

    String name;
    String address;

    public Student2( String name, String address){
        this.address=address;
        this.name=name;

    }
    public void displayName(){
        System.out.println(name);
        System.out.println(address);
    }
    public static void main(String [] args){

        Student2 s2=new Student2("Maksym","Keen Crescent AB Canada");
        s2.displayName();
    }

}
