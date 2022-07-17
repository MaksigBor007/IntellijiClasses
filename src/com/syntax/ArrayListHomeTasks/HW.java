package com.syntax.ArrayListHomeTasks;

import org.omg.Messaging.SyncScopeHelper;

import java.util.ArrayList;

public class HW {

    //Create an CollectionsFramework that will store 5 names into it.
    //Find out whether the given CollectionsFramework is empty or not?
    //Check whether the specific name is present in an CollectionsFramework or not?
    //Find the size of your arrayList and print all values from that
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>(5);//always good to specify initial capacity to improve the performance
        names.add("Maks");
        names.add("Kirill");
        names.add("Sergey");
        names.add("Ramiar");
        names.add("Tara");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Ramiar"));
        System.out.println("Size of my CollectionsFramework is "+names.size());
        System.out.println("All values from CollectionsFramework "+names);


    }
}