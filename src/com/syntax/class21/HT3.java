package com.syntax.class21;

public class HT3 {
         /*
         Create 1 class in which create a methods that will calculate the area (volume in case of box) of
         *Rectangle
         *Square
         *Box
        */
         static void methodArea(double width, double length) {
          double sum=width*length;
             System.out.println("The are of Rectangle is "+sum);
         }
         static void methodArea(int width){
             int sum1=width*width;
             System.out.println("The area of Square is "+sum1);
         }
         static void methodArea(int width,int length, int height){
             int sum2=(2*length*width)+(2*length*height)+(2*height*width);
             System.out.println("The area of Box is "+sum2);
         }

    public static void main(String[] args) {
        HT3.methodArea(10.5,15.3);
        HT3.methodArea(5);
        HT3.methodArea(5,10,15);
    }

}
