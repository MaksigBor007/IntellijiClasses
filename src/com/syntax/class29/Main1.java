package com.syntax.class29;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;
class Main1 {
    public static void main(String[]args){
        HashMap<String,String> map=new HashMap<>();

        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");


        Iterator<Entry<String,String>> it= map.entrySet().iterator();
        while(it.hasNext()) {
            Entry<String, String> en = it.next();
            String k = en.getKey();
            String v = en.getValue();
            System.out.println("HashMap Before Remove:");
            System.out.println(k + ":" + v);
            System.out.println("------------------");
        }


        }
        }



