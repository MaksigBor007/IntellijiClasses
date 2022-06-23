package com.syntax.class22;

public class Parent {
    String name;
    void getMarried(){
        System.out.println("Hamid get maried with a girl");
    }
    static class Hamid extends Parent {

      /*
       *     void getMarried(){
       *    System.out.println("I want to try on Tara First");
        }
      */
    }
        public static void main(String[] args) {
            Hamid hamid=new Hamid();
            hamid.getMarried();

        }
    }

