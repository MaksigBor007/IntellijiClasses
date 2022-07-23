package com.syntax.hometasks;

import java.util.HashMap;

public class Building {
    public static void main(String[] args) {
        //Create a map of a building.
        //Store floor number and it is associated company name.
        //(Example: 1= Google, 2=Syntax etc..).
        //Insert 7 entries with duplicate keys and values.
        //Check how many entries you have?
        //Update company on a 4th floor
        //Remove company on the 7th floor
        //Print your map


        HashMap<Integer,String> building=new HashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntex");
        building.put(3,"Apple");
        building.put(4,"Dell");
        building.put(5,"Dell");
        building.put(6,"Huawei");
        building.put(7,"Huawei");

        System.out.println(building.size());
        building.replace(4,"Samsung");
        building.remove(7,"Huawei");



    }
}
