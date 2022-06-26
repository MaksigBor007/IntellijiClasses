package com.syntax.class21;

class Main {

        static class Person{
            String name;
            String lastName;
            int age;
            Person(String name, String lastName, int age, int salary){
                this.name=name;
                this.lastName=lastName;
                this.age=age;
            }
        }

      static  class Employee extends Person{
             int salary;
          Employee(String name, String lastName, int age, int salary) {
              super(name,lastName,age,salary);
          }
          void printInfo(){
                System.out.println(name+" "+lastName+" "+age+" "+salary);
            }
        }
         static class Student extends Employee{
                  int grade;

            Student(String name,String lastName,int grade,int salary){
                super(name,lastName,grade,salary);

            }
            void printInfo(){

                System.out.println(name+" "+lastName+" "+age+" "+grade);
            }
        }
        static class Retiree extends Student{
            static String seniorActivity="tour";


            Retiree(String name, String lastName, int age) {
                super(name,lastName,age, Integer.parseInt(seniorActivity));



            }

            void printInfo(){
                System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
            }
        }
        public static void main(String[] args){
            Employee e=new Employee("Joe","Smith",35,35000);
            e.printInfo();
            Student student=new Student("Adam","Smith",15,10);
            student.printInfo();
            Retiree retiree=new Retiree("Frank","Smith",15);
            retiree.printInfo();
        }
    }


