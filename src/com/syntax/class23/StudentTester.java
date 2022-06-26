package com.syntax.class23;

public class StudentTester {
    public static void main(String[] args) {
        Student[] student={new Student(),new SyntaxStudent(),new CollegeStudent(),new SchoolStudent() };
        for (Student s: student){
            s.student1();
            s.student2();
            s.student3();

        }
    }
}
