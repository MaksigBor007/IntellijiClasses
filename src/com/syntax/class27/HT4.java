package com.syntax.class27;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HT4 {

    /*Create a Set collection that will hold Objects of Student Type.
    * In this set we do not care about the insertion order.
    * Each student object should have name and studentID. Display name of each student.
     */

    public static void main(String[] args) {
        HashMap<String,Integer> studentType=new HashMap<>();
        studentType.put("Maks",150);
        studentType.put("Aladdin",100);
        studentType.put("John",300);



        Iterator<String> iterator=studentType.keySet().iterator();
          while(iterator.hasNext()){
              System.out.println(iterator.next());
          }



    }


}
