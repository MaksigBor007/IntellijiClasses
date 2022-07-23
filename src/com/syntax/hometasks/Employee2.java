package com.syntax.hometasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Employee2 {

    public static void main(String[] args) {


        //Create a Map that will store Employee name and salary.
        //Write a logic to retrieve an employee who gets the highest salary.
        //Output should be in the below format
        //John Smith=$100000

        HashMap<String, Integer> person = new HashMap<>();
        person.put("Maks", 50000);
        person.put("Sasha", 60000);
        person.put("Petya", 70000);
        Integer maxSal = 0;
        String emp="";
        Iterator<Entry<String, Integer>> it = person.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, Integer> pair = it.next();
            if (pair.getValue() > maxSal) {
                maxSal = pair.getValue();
                emp = pair.getKey();

            }
        }
            System.out.println(emp+"="+maxSal);

        }

    }

