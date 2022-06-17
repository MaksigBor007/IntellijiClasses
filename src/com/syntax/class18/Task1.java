package com.syntax.class18;

public class Task1 {
    //Create a method that will accept an array as parameters
    // and will return a sum of all elements from that array.
    // Method should be visibly only within same package and
    // accessible by the creating an instance of the class.

    public int num(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        int arr[]={10,20,30};
        System.out.println(t1.num(arr));

    }
}

