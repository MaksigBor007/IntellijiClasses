package com.syntax.interview;

import java.util.Arrays;

public class RemoveIndexFromArray {
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

//output is _ 14 56 15 36 56 77 18 _ _
        for (int i = 1; i < myArray.length - 2; i++) {
            myArray[i] = myArray[i];

            System.out.print(myArray[i] + " ");


        }
    }
}