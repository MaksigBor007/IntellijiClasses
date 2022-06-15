package com.syntax.class16;

import com.syntax.class17.Employee;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        AccessModifiersDemo1 ac=new AccessModifiersDemo1();
      //  System.out.println(ac.password);//can not get access because its private
        System.out.println(ac.SSN);
        System.out.println(ac.name);
        Employee emp=new Employee();
        Scanner scanner=new Scanner(System.in);

    }



}
