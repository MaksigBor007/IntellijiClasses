package com.syntax.class27;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HT2 {
    public static void main(String[] args) {
        /*Create a Set collection in which you need to add names of the countries.
         *In this set we want all objects to be sorted in alphabetical order.
         *Using 2 different ways retrieve all elements from set.
         */

        Set<String> countries=new HashSet<>();
        countries.add("Istanbul");
        countries.add("Calgary");
        countries.add("Vinnitsya");

        System.out.println(countries);

        Iterator<String> iterator= countries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
