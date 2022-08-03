package com.syntax.hometasks;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class HTLastOne {

    //Create the collection that will store single uniques
    //Objects of a String type in which order is preserved.
    //Write a logic to concatenate all string from the collection.
    //Create a collection of integers in which you can keep duplicates.
    //Write a logic to find sum of all integers

    public static void main(String[] args) {
        LinkedHashSet <String> collection=new LinkedHashSet<>();
        collection.add("Hey");
        collection.add("Bro");
        collection.add("How's");
        collection.add("it going?");

        Iterator<String> all=collection.iterator();
        while(all.hasNext()){
           String k= all.next();
            System.out.println(k);
        }
        System.out.println("----------------");

        StringBuilder allValues=new StringBuilder();//save more memory and much faster to use StringBuilder
        for(String v:collection){
            allValues.append(v);

        }System.out.print(allValues);







    }
}
