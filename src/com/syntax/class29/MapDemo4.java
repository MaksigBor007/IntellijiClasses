package com.syntax.class29;



import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",2000.0);
        fruit.put("Orange",20.5); // auto upcasting doesnt work with wrapper
        fruit.put("Kiwi",10.2);
        fruit.put("Bannana",10.2);
        fruit.put("Peach",10.5);

        Set<Map.Entry<String,Double>> entries= fruit.entrySet();
        for(Map.Entry<String,Double> entry:entries){
            String k= entry.getKey();
            Double v=entry.getValue();
            System.out.println("entry = "+k+" values = "+v);
        }
    }
}
