package com.syntax.interview;

import java.util.Arrays;

public class CountDuplicates2 {
    //tiny&tiny changes

    public static void main(String[] args) {

        int[] arr = {20, 20, 40, 50, 30, 30, 30, 30};
        counterDuplicates(arr);

    }

    static void counterDuplicates(int[] arr) {
        int counter = 0;
        int[] arr2 = new int[arr.length];
        for (int j:arr) {
            if (!isPresent(j, arr2)) {
                arr2[counter++] = j;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    static boolean isPresent(int element, int[] arr) {

        for (int e : arr) {
            if (element == e) {
                return true;
            }
        }
        return false;
    }
}