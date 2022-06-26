package com.syntax.class22;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
    double balance;
    double interest;
    double methodCal(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
        return balance * (interest / 100);
    }
}class Visa extends CreditCard{

        double methodCal(){
            return balance*(interest/100);
        }
 }class AX extends CreditCard{
     double methodCal(){
         return balance*(interest/100);
     }
     public static void main(String[] args) {
        CreditCard cc=new CreditCard();
        System.out.println(cc.methodCal(1087.39,1.99));
        Visa v=new Visa();
        System.out.println(v.methodCal(3087.39,3.88));
        AX ax=new AX();
        System.out.println(ax.methodCal(1988.21,4.23));

    }

}
