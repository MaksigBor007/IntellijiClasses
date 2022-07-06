package com.syntax.ArrayListHomeTasks;

//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

import java.util.ArrayList;

public class Drinks {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Vodka");
        drinks.add("Jin");
        drinks.add("Marengo");

        for(int i=0;i<drinks.size();i++){
            if(drinks.get(i).contains("e") || drinks.get(i).contains("a")){
                drinks.remove(i);
                drinks.add(i,"water");
            }
        }
        System.out.println(drinks);
    }
}
