package com.syntax.class20;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50, 50, 40};
        countDup(num);
    }


    static void countDup(int[]num){
        int counter=0;
        int[] num2=new int[num.length];
        for(int j:num){
            if(!isPresent(j,num2)){
                num2[counter++]=j;
            }
        }
        System.out.println(Arrays.toString(num2));

    }
    static boolean isPresent(int element,int[]num){
        for(int e:num){
            if(element==e){
                return  true;
            }
        }
     return false;
    }
}