package com.syntax.class15;

public class ArrayUtils {

    void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum+= + num;
        }
        return sum;
    }
        public static void main (String[]args){
            ArrayUtils arrUt = new ArrayUtils();
                 int arr[]={10,20,30};
            System.out.println(arrUt.sumArray(arr));
        }

    }