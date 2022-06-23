package com.syntax.class22;

public class AdvanceCal {


    static void sum(int ...arr){
       // System.out.println(arr[0]);
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of all the parameter value"+sum);
    }
static void printName(String...names){
        for(String name:names){
            System.out.println(name);
        }
}
    public static void main(String[] args) {
        sum(2,2,3,4);
        //printNames("Aladin","dcsc","scesc");

        int age=10;
        String name;
        if(age>18){
            name="Time to go to work";
        }else{
            name="Enjoy no Work";
        }
        System.out.println(name);
        // String name=age>18?"Time to go":"Enjoy no Work";
    }
}
