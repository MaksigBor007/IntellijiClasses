package com.syntax.class19;

public class Teacher {
    // Write a Java program called Teacher.  Identify features and behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have
    // it their own features and behaviour. Test all 4 classes
       String name; String degree;
}      class mathTeacher extends Teacher {
        void method1(String name, String degree) {
            this.name = name;
            this.degree = degree;
            System.out.println(name+" "+degree);
        }
    } class chemistryTeacher extends Teacher {
        void method2(String name, String degree) {
            this.degree = degree;
            this.name = name;
            System.out.println(name+" "+degree);
        }
    }  class pianoTeacher extends Teacher {
        void method3(String name, String degree) {
            this.degree = degree;
            this.name = name;
            System.out.println(name+" "+degree);

        } public static void main (String[]args){
             mathTeacher mt=new mathTeacher();
             mt.method1("Alexa","diploma");
             chemistryTeacher ct=new chemistryTeacher();
             ct.method2("Mumtaz","PHD");
             pianoTeacher pt=new pianoTeacher();
             pt.method3("Maks","High school");
        }
        }




