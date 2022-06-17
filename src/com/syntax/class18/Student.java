package com.syntax.class18;

public class Student {
//Write a java Class Students that have a constructor which takes students name
// and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
// Test Student class for 5 different students with different marks.
// Your program should print an average mark of each student name.

    public String name;
    int Math;
    int Geography;
    int Art;
    public Student (String name, int Math, int Geography,int Art){
        this.Art=Art;
        this.name=name;
        this.Geography=Geography;
        this.Math=Math;
    } public int averageGrade(){
        return (Art+Math+Geography)/3;
}

}
