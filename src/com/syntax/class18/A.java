package com.syntax.class18;

 class A {
//Write program to inherit class A that has method printF which is static and call or reuse that method into class B
static void methodF(){
    System.out.println("hello");
}
}
class B extends A {
    public static void main(String[] args){
        B b=new B();
        B.methodF();



    }

}



