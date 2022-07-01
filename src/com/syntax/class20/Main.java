package com.syntax.class20;
class Main {
    final StringBuilder method(){
        StringBuilder str=new StringBuilder("hello");
        str.reverse();

        return str;
    }
    public static void main(String[] args){
        Main m=new Main();
        System.out.println(m.method());
    }

}