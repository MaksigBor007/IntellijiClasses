package com.syntax.class21;

public class HT1 {


    //Create a class named 'Programming'.
    // While creating an object of the class, if nothing is passed to it, then the message
    // "I love programming languages" should be printed. If some String is passed to it, then in place
    // of "programming languages" the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.
    static class Programming {

         Programming() {
            System.out.println("I love programing languages");
        }

        Programming(String java) {
            System.out.println("I love "+java);


        }
    }
        public static void main(String [] args){
         Programming p=new Programming();
         Programming p2=new Programming("java");

        }
    }


