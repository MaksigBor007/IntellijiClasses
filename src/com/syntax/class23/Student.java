package com.syntax.class23;

public class Student {

    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override some methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism
    void student1(){
        System.out.println("Well done boy");
    }
    void student2(){
        System.out.println("You have to study harder");
    }
    void student3(){
        System.out.println("You are a slacker, useless");
    }

}
    class SyntaxStudent extends Student{

        /**
         *
         */
        @Override
        void student1() {
            System.out.println("If you are a Syntax's student you will achieve the destination");
        }

        /**
         *
         */
        @Override
        void student2() {
            System.out.println("No pain, no gain - told Asghar, the instructor in Syntax");
        }

        /**
         *
         */
        @Override
        void student3() {
            System.out.println("More Repls, more tasks, help you to gain my boy");
        }
    }
    class CollegeStudent extends Student{

        /**
         *
         */
        @Override
        void student1() {
            System.out.println("For Real?You think a college has better curriculums?! ");
        }

        /**
         *
         */
        @Override
        void student2() {
            System.out.println("If you feel like you need more task - here you go more tasks");
        }

        /**
         *
         */
        @Override
        void student3() {
            System.out.println("Today is easy study day but first polymorphism, Methods, Overloading,Overriding,Arreys,Strings");
        }
    }
    class SchoolStudent extends Student{
        /**
         *
         */
        @Override
        void student1() {
            System.out.println("No tasks, no study");
        }

        /**
         *
         */
        @Override
        void student2() {
            System.out.println("Just LaidBack");
        }

        /**
         *
         */
        @Override
        void student3() {
            System.out.println("Are you sure you wanna go to school today?");
        }
    }




