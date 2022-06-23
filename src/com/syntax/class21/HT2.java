package com.syntax.class21;

public class HT2 {

    //Create 1 class with a static method that has 3 overloaded forms.
    //Then call each overloaded method with specific arguments and observe result.

     static void method() {
        System.out.println("Empty one");
    }

     static void method(String name, int number) {
        System.out.println("2 parameters - " + name + " " + number);
    }

    static void method(int number, String name) {
        System.out.println("Verse visa of the parameters - " + number + " " + name);

    }
}
    class HT2Tester extends HT2 {
        public static void main(String[] args) {
            HT2Tester ht = new HT2Tester();
            HT2.method();
            HT2.method("Maks", 25);
            HT2.method(25, "Maks");
        }
    }
