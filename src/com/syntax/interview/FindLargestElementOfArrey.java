package com.syntax.interview;

import java.util.Arrays;

public class FindLargestElementOfArrey {

        public static void main(String[] args) {
            int[] my_array = {10,20,30,40,50,60,70,80,90,100};

            Arrays.sort(my_array);
            int index = my_array.length-1;
            while(my_array[index]==my_array[my_array.length-1]){
                index--;
            }
            System.out.println("Second largest value: " + my_array[index]);
}
}