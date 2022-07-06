package com.syntax.ArrayListHomeTasks;

import java.util.ArrayList;

//Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();

        for (int i=1;i<500;i++){
            numbers.add(i);
        }

        for (int j=0;j<numbers.size();j++){
            if(numbers.get(j)%5==0){
                numbers.remove(j);
            }
        }
        System.out.println(numbers);
    }
}
