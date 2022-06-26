package com.syntax.class17;

import com.syntax.class18.Task6;

public class Task6TesterOutsidePack {
    public static void main(String[] args) {
        new Task6("hghjk");
          // Task6 obj2=new Task6(); private modifier works inside the class it was created only !!
         //  Task6 obj3 = new Task6(2); default modifier works within or any class in the same package !!
        //   Task6 obj4 = new Task6(true); protected modifier works from ny class and any package only by inheritance
    }
}