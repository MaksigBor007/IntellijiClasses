package com.syntax.class16;

public class InstanceDemo {

    String str="instance";

    void changeInstanceValue1(){
        str="mwthod1";

    }
    void changeInstanceValue(){
        System.out.println(str);
    }
    public static void main(String[] args){
        InstanceDemo id=new InstanceDemo();
        System.out.println(id.str);//prints the value of str which is instance
        id.changeInstanceValue();// method once simple prints the value of str which is still instance
        id.changeInstanceValue1();//this method changes the instance variable value which will be not Captain Marvel
        id.changeInstanceValue();//method once simple prints the value of str which is now instance Captain Marvel
    }



}
