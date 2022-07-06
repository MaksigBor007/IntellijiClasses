package com.syntax.ArrayListHomeTasks;

import java.util.ArrayList;

public class HW {

    //Create an ArrayList that will store 5 names into it.
    //Find out whether the given ArrayList is empty or not?
    //Check whether the specific name is present in an ArrayList or not?
    //Find the size of your arrayList and print all values from that
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Maks");
        names.add("Kirill");
        names.add("Sergey");
        names.add("Ramiar");
        names.add("Tara");
          if (names.isEmpty()){
              System.out.println("ArryList is empty");
          }else {
              System.out.println("ArryList is not empty");
        }
        System.out.println(names.contains("Ramiar"));
        System.out.println("Size of my ArrayList is "+names.size());
        System.out.println("All values from ArrayList "+names);


    }
}