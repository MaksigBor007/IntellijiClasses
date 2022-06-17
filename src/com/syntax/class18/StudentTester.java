package com.syntax.class18;

public class StudentTester {
    public static void main(String [] args){
        Student s1=new Student("Adolf",40,77,100);
        System.out.println(s1.name+" Average grade is "+s1.averageGrade());

        Student s2=new Student("Alla",99,20,10);
        System.out.println(s2.name+" Average grade is "+s2.averageGrade());

        Student s3=new Student("Mumtaz",99,99,100);
        System.out.println(s3.name+" Average grade is "+s3.averageGrade());

        Student s4=new Student("Maksym",50,90,100);
        System.out.println(s4.name+" Average grade is "+s3.averageGrade());

        Student s5=new Student("Jared",60,70,20);
        System.out.println(s5.name+" Average grade is "+s5.averageGrade());
    }
}
