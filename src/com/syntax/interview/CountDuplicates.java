package com.syntax.interview;

public class CountDuplicates {

    public static void main(String[] args){

        int [] arr={20,20,40,50,30,30};
        CountDuplicates cd=new CountDuplicates();
        System.out.println(cd.countDuplicates(arr));
    }

    int countDuplicates(int[] arr){
        int counter=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    counter++;
                }
            }
        }
        return counter;
    }
}
