package com.syntax.class20;

    class EncapsulationDemo{
        private String empName="John";
        private int empAge=30;

        public String getName(){
            return empName;
        }
        public int getAge(){
            return empAge;
        }
    }
    class Main {
        public static void main(String[] args) {
        EncapsulationDemo enc=new EncapsulationDemo();

     System.out.println("Employee Name: "+enc.getName());
     System.out.println("Employee Age: "+enc.getAge());
    }
}

