package com.syntax.class20;

 public class Shape {

     //Write program: Shape class has a constructor that takes the radius and
     // has a subclass as  circle class. In circle class create a method to
     // calculate the area of circle. Test your code\
     int radius;

     Shape(int radius) {

         this.radius = radius;
     }
 }
 class circle extends Shape {
         circle(int radius) {

             super(radius);
        }
        void calArea(int radius) {
            double sum = 0;
            sum = (3.14159)* (radius * radius);
            System.out.println(sum);
        }
        public static  void main(String[] args) {
            circle c=new circle(20);
            c.calArea(20);
         }
 }
