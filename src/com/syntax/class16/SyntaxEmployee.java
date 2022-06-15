package com.syntax.class16;

public class SyntaxEmployee {
/*Create a Class called SyntaxEmployee:
*Create three  variables  empID , salary and set the CEO to “Sumair”
*Create two objects of the class SyntaxEmployee
*Set the value of eID, salary for each of the objects
*Print out the eID , salary and  CEO for each of the objects
 */


   int empID;
   double salary;
   //whenever we are sure that 2 objects of a class can have different values for
    //a variables or if we have to share that variable between 2 or more methods of that
    //class we should always go with instance variables.
  static String CEO="Sumair";

    public static void main(String[] args){
        SyntaxEmployee se=new SyntaxEmployee();
          se.empID=1;
          se.salary=5000;
          System.out.println("The Employee's ID "+se.empID+" Employee's salary is "+se.salary+" CEO is "+se.CEO);



        SyntaxEmployee se2=new SyntaxEmployee();
        se2.empID=2;
        se2.salary=8000;
        System.out.println("The Employee's ID "+se2.empID+" Employee's salary is "+se2.salary+" CEO is "+se2.CEO);





    }






}
