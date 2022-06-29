package com.syntax.class20;

final class Main {


    final static double avgElements(int[] a){
        double sum=0;
        double avar=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
            avar= sum/a.length;

        }
        return avar;
    }



    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8


    }
}

