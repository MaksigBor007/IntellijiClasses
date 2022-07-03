package com.syntax.interview;

public class SumOf2DArrey {
    public static int sum(int[][]a){
        int sum1 = 0;
        for (int[] arr : a)
            for(int i: arr)
                sum1+=i;

        return sum1;
    }



    public static void main(String[] args) {
        int [][]a={
                {1,2,3},{4,5,6},{7,8,9},
        };
        SumOf2DArrey m=new SumOf2DArrey();
        System.out.println(m.sum(a));
    }
}


