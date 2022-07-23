package com.syntax.class25;

import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
class Main {
    public static void main(String[] args){
        TreeMap<String,String> keys=new TreeMap<>();
        keys.put("1 item","apple");
        keys.put("2 item","banana");
        keys.put("3 item","pear");
        keys.put("4 item","tomato");
        keys.put("5 item","mango");
        keys.put("6 item","kiwi");

        Set<Map.Entry<String,String>> entries= keys.entrySet();
        for(Map.Entry<String,String> entry:entries){
            String k = entry.getKey();
            String v = entry.getValue();
            System.out.println("Key is " + k + " and values is " + v);



        }

    }
}