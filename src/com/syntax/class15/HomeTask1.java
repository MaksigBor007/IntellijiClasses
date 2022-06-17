package com.syntax.class15;

public class HomeTask1 {
    void max(int a, int b) {
        if (a > b) {
            System.out.println("The large number is " + a);
            
        } else {
            System.out.println("The largest number is " + b);
        }
    }


    public static void main(String[] args) {
        HomeTask1 ts = new HomeTask1();
        ts.max(10, 20);

    }
}
