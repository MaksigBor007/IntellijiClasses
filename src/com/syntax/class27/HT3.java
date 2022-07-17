package com.syntax.class27;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HT3 {

    public static void main(String[] args) {
        /* Create a Set of cities in which you want to make sure that insertion order is maintained.
         * Then remove any city that starts with “A”;
         */

        Set<String> cities=new HashSet<>();
        cities.add("New York");
        cities.add("Mumbai");
        cities.add("Anchorage");
        cities.add("Albuquerque");

        Iterator<String> iterator= cities.iterator();
while(iterator.hasNext()){
    if(iterator.next().contains("A")){
        iterator.remove();
    }

}
        System.out.println(cities);

    }
}
