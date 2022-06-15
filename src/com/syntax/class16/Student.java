package com.syntax.class16;

public class Student {
    /*Create a Class called Students
     *Create three  variables  Name , ID  and  numberOfStudents
     *Create three objects of the Students Class
     *Set the value for  studentName , studentID and increment  the numberOfStudents for each object
     *Print out  total number of students
    */

    String Name;
    int ID;
   static int numberOfStudents;




    public static void main(String[] args){
         Student s=new Student();
          s.ID=100;
          s.Name="Maks";
          s.numberOfStudents++;

          Student s2=new Student();
          s2.ID=107;
          s2.Name="Vladimir";
          s2.numberOfStudents++;

          Student s3=new Student();
          s3.ID=180;
          s3.Name="Grisha";
          s3.numberOfStudents++;

          System.out.println(numberOfStudents);
    }



}
