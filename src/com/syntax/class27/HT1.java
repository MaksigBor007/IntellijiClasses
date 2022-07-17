package com.syntax.class27;

import java.util.ArrayList;
import java.util.List;

public class HT1 {
    public static void main(String[] args) {
        //List<String> aList=new ArrayList<>();
        //aList.add("John");
        //aList.add("Jane");
        //aList.add("James");
        //aList.add("Jasmine");
        //aList.add("Jane");
        //aList.add("James");


        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        aList.removeAll(aList);
        System.out.println(aList );
    }
}
