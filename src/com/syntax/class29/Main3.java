package com.syntax.class29;

public class Main3 {
    public static void gradeCheck(int grade) throws SyntaxStudentException {
        if (grade > 90) {
            throw new SyntaxStudentException("You are an exceptionally awesome student");
        } else if (grade < 90) {
            System.out.println("You are a great student");
        } else {
            System.out.println(" ");
        }
    }

    public  static void main(String[] args) throws SyntaxStudentException {
        try {
            Main3.gradeCheck(95);
        } catch (SyntaxStudentException e) {
            System.out.println(e);
        }

    }
}


