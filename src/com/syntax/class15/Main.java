package com.syntax.class15;

import java.util.ArrayList;
import java.util.LinkedList;

class Main {


            LinkedList<Integer>fibonacciList =new LinkedList<Integer>();


        public LinkedList<Integer> sum() {
            int n, a = 0, b = 0, c = 1;

            for(int i = 0; i <= 10; i++)
            {
                fibonacciList.add(a);
                a = b;
                b = c;
                c = a + b;
            }
            return fibonacciList;
        }

        public void display() {
            System.out.println(fibonacciList);
        }

        public static void main(String[] args) {
            Main fibonacciList = new Main();
            fibonacciList.sum();
            fibonacciList.display();
    }
    }


