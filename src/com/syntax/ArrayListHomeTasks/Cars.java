package com.syntax.ArrayListHomeTasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars{
    //Create an arraylist of cars and retrieve all the values using 3 different ways.

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Kia");
        cars.add("Huyndai");
        cars.add("Citroёn");

        System.out.println(cars); // 1st way of retrieving

        for(int i=0;i< cars.size(); i++){  //2nd way
            System.out.println(cars.get(i));
        }

        for(String v:cars){
            System.out.println(v);  //3rd way
        }

        Iterator<String> iterator=cars.iterator();  //4th way
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }






    }
}