package com.syntax.class19;

public class A {

    void methodA(){
    System.out.println("A");
    }
}
    //Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
      class B extends A {
        void methodB() {
            System.out.println("B");
        }
    }
     class C extends B {
        void methodC() {
            System.out.println("C");
        }

        public static void main(String[] args) {
            C c=new C();
            c.methodA();
            c.methodB();
            c.methodC();
        }
    }


