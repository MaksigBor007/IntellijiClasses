package com.syntax.class17;

public class TeacherClass {

    public static void main(String [] args){
        Teacher teacher=new Teacher();
        teacher.name="High School";
        teacher.schoolName="Harvard";
        /*because printInfo is public we can call
         *it in other classes and its the part
         * of Teacher class it can access the
         * private fields which in turn let us access
         * those fields
         */
        teacher.printInfo();






    }
}
