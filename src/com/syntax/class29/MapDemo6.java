package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapDemo6 {
    public static void main(String[] args) {
        //how can we remove the elements from a map bases on the value
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2000.0);
        fruit.put("Orange",20.5); // auto upcasting doesnt work with wrapper
        fruit.put("Kiwi",10.2);
        fruit.put("Bannana",10.2);
        fruit.put("Peach",10.5);

        Collection<Double> values=fruit.values();
         values.removeIf(value->value>10.2);
        System.out.println(fruit);
    }
}
