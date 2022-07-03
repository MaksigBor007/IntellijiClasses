package com.syntax.class26;

import java.util.ArrayList;

public class Demo2 {

    public static void main(String[] args) {
        ArrayList<Character> arayList=new ArrayList<>();
        arayList.add('A');
        arayList.add('B');//adds the element to an arrayList
        arayList.add('C');
        arayList.add('D');
        System.out.println(arayList);
        System.out.println(arayList.get(2));  //gets back the elements from the list

        for(int i=0;i<arayList.size();i++){
            System.out.println(arayList.get(i));
        }
    }
}
