package com.syntax.class17;

public class Student2 {
    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Student2 student2 = new Student2();
        student2.name = "Arif007";
        student2.id = "JB123";
        numberOfStudents = 1;// if we are inside the same class we can access static variables inside static
        //methods by just writing the name of that variable we don't need to create an object
        System.out.println(student2.name);
        System.out.println(student2.id);
        System.out.println(numberOfStudents);

        Student2 student3 = new Student2();
        student3.name = "Arif008";
        student3.id = "JB1234";
        numberOfStudents = 2;
        System.out.println(student3.name);
        System.out.println(student3.id);
        System.out.println(numberOfStudents);
    }
}