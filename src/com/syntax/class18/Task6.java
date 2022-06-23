package com.syntax.class18;

public class Task6 {

    //Write a java class that have 4 constructors with 4 different access
    // levels of constructors(private,public,default,protected) and create 4 objects of this class:
    // 1 - inside same class; 2 - from outside the class; 3
    // - from different class inside different package  and observe result.

    String a;
    int c;
    boolean b;
    public Task6(String a){
        System.out.println("This constructor is PUBLIC");
    }
    private Task6(){
        System.out.println("This constructor is PRIVATE");
    }
    Task6(int c){
        System.out.println("This constructor is DEFAULT");
    }
    protected Task6(boolean b){
        System.out.println("This constructor is PROTECTED");
    }
    public static void main(String [] args){
        Task6 obj1=new Task6();
        Task6 obj2=new Task6();
        Task6 obj3=new Task6();
        Task6 obj4=new Task6();

    }
}
