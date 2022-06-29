package com.syntax.class21;

class ReplMultiLevelInheritance {

    //Create four classes (Person, Employee, Student, Retiree)
    //Have properties
    //For Person: name(String)
    //
    //For Person: lastName(String)
    //
    //For Person: age(int)
    //
    //For Employee: salary(int)
    //
    //For Student: grade(int)
    //
    //For Retiree: seniorActivity(String)
    //
    //At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output
    //
    //Create multilevel inheritance: Person --> Employee --> Student --> Retiree
    //
    //From your Main class create objects of the Employee, Student and Retiree classes and call the print method.

        static class Person{
            String name;
            String lastName;
            int age;
            Person(String name, String lastName, int age){
                this.name=name;
                this.lastName=lastName;
                this.age=age;
            }
        }

      static  class Employee extends Person{
             int salary;
          Employee(String name, String lastName, int age, int salary) {

              super(name,lastName,age);
              this.salary=salary;
          }
          void printInfo(){
                System.out.println(name+" "+lastName+" "+age+" "+salary);
            }
        }
         static class Student extends Employee{
                  int grade;

            Student(String name,String lastName,int age,int salary,int grade){
                super(name,lastName,age,salary);
                this.grade=grade;

            }
            void printInfo(){

                System.out.println(name+" "+lastName+" "+age+" "+grade);
            }
        }
        static class Retiree extends Student{
            String seniorActivity;


            Retiree(String name, String lastName, int age,int salary,int grade, String seniorActivity) {
                super(name,lastName,age,salary,grade);
                            this.seniorActivity=seniorActivity;


            }

            void printInfo(){
                System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
            }
        }
        public static void main(String[] args){
            Employee e=new Employee("Joe","Smith",35,35000);
            e.printInfo();
            Student student=new Student("Adam","Smith",15,35000,10);
            student.printInfo();
            Retiree retiree=new Retiree("Frank","Smith",15,35000,0,"tour");
            retiree.printInfo();
        }
    }


