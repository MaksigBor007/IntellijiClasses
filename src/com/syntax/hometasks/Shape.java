package com.syntax.hometasks;

public interface Shape {
    /* Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
     * Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
     * Test your code.
     */


    void calculateArea();
    void calculatePerimeter();
}

class Circle implements Shape{

    /**
     *
     */
    @Override
    public void calculateArea() {
    int radius=3;
    double area=0;
    area = (3.14159)* (radius * radius);
        System.out.println("Area of Circle is "+area);

    }

    /**
     *
     */
    @Override
    public void calculatePerimeter() {
      int radius=6;
      double p=0;
      p=2*(3.14159)*radius;
        System.out.println("Perimeter of Circle is "+p);
    }
}
class Square implements Shape{
    /**
     *
     */
    @Override
    public void calculateArea() {
int a =4;
double area=0;
area=a*2;
        System.out.println("Area of Square is "+area);
    }

    /**
     *
     */
    @Override
    public void calculatePerimeter() {
    int a=5;
    double p=0;
    p=a*4;
        System.out.println("Perimeter os Square is "+p);

    }

    public static void main(String[] args) {
        Shape[] shape={new Circle(),new Square()};
        for (Shape s:shape){
            s.calculateArea();
            s.calculatePerimeter();

        }
    }
}