package com.syntax.class20;

public class Shape2 {

   /*
   Write program: Shape class has a constructor that takes
    the radius and has a subclass as  circle class. In circle class create a method
    to calculate the area of circle. Test your code
    */

        double radius;
        Shape2(double radius){
            this.radius=radius;
        }
    }

    class Circle extends Shape{

        Circle(int radius) {
            super(radius);
        }
        void calculateAndPrintArea(){
            double area=Math.PI*Math.pow(radius,2);
            System.out.println("Area "+area);
        }
    }
    class Tester{

        public static void main(String[] args) {
            Circle circle=new Circle(2);
            circle.calculateAndPrintArea();
        }
    }

