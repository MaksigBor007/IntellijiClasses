package com.syntax.hometasks;

import java.util.Collection;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class Countries {
    public static void main(String[] args) {
        //Create a map of countries with its capital that will store countries in alphabetical order.
        //Print all keys and values from a country map using for each loop and iterator.
        //Print all values from a country map using for each loop and iterator.


        HashMap<String,String> countries=new HashMap<>();

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
