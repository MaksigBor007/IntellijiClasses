package com.syntax.interview;

import java.util.Arrays;

public class RemoveIndexFromArray {
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int removeInd = 6;

        for (int i = removeInd; i < myArray.length - 1; i++) {
            myArray[i]=myArray[i+1];

            System.out.println(Arrays.toString(myArray));

        }
    }
}