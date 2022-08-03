package com.syntax.hometasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BestBuyStore {

    //Create a map of Best Buy store.
    //Place item id and item name into it.
    //Example (7664847 = Printer, 7879885= TV etc )
    //Retrieve all keys and values from a Best Buy map using EntrySet.
    public static void main(String[] args) {


        HashMap<Integer, String> bestBuy = new HashMap<>();
        bestBuy.put(1001,"Epson");
        bestBuy.put(1002,"Xerox");
        bestBuy.put(1003,"Dell");
        bestBuy.put(1004,"Staples");


        for(Map.Entry<Integer,String> entry:bestBuy.entrySet()){
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println("Keys: "+key+"  "+"Values: "+value);

        }







    }
}