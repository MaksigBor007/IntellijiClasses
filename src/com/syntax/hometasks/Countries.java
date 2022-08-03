package com.syntax.hometasks;

import java.util.*;
import java.util.Map.Entry;


public class Countries {
    public static void main(String[] args) {
        //Create a map of countries with its capital that will store countries in alphabetical order.
        //Print all keys and values from a country map using for each loop and iterator.
        //Print all values from a country map using for each loop and iterator.


        TreeMap<String,String> countries=new TreeMap<>();

        countries.put("USA","Washington DC");
        countries.put("Turkey","Ankara");
        countries.put("Ukraine","Kiev");
        countries.put("Canada","Ottawa");

        Iterator<Entry<String,String>> it=countries.entrySet().iterator();
        while (it.hasNext()){
            Entry<String,String> all=it.next();
            String k = all.getKey();
            String v = all.getValue();
            System.out.println("Key: "+k+" values: "+v);
        }
        System.out.println("----------------------------");

        //Entry object has a method get key to get the key and another method to get the value
        for(Map.Entry<String,String> entry: countries.entrySet()){

            System.out.println("entry key = " + entry.getKey()+" entry value = " +entry.getValue());
        }

        //countryCapitalMap.entrySet()=>a set of Entry objects
        //entrySet().iterator() once we have the set we can get an iterator on that set

        Set<Entry<String,String>> entries= countries.entrySet();
        for(Entry<String,String> entry:entries){
            String k=entry.getKey();
            String v=entry.getValue();
            System.out.println("Keys: "+k+" Values: "+v);
        }

        Collection<String> values=countries.values();
        for(String val:values){
            System.out.println(val);
        }
        System.out.println("-------------------------");

        Iterator<String> it2=countries.values().iterator();
        while(it2.hasNext()){
            String v= it2.next();
            System.out.println("Values: "+v);
        }








    }
}
