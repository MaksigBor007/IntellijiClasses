package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {
        /*Car car=new Tesla();
         car=new Toyota();
         car.start();
         BMW bmw=new BMW();
         bmw.start();
         bmw.stop();
         bmw.park();
         Tesla tesla=new Tesla();
         tesla.park();
         tesla.start();
         tesla.stop();
         Toyota toyota=new Toyota();
         toyota.park();
         toyota.start();
         toyota.stop();
         */
        /* Car car=new BMW();
         car.stop();
         car.park();
         */
         Car[] cars={new BMW(),new Tesla(),new Toyota()};

        for(Car c:cars){
             c.park();
             c.start();
             c.stop();
         }
    }
}
