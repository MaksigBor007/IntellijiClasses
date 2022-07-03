package com.syntax.class25;

public interface IP65 {
    /*All variables in INTERFACE are PUBLIC, STATIC and FINAL,
    * so we have to initialize a variable every time we write the code!
    * No NEED to write PUBLIC,STATIC,FINAL because they are by default PUBLIC,STATIC,FINAL!
    * no need to write ABSTRACT as well.
    * There should be ONLY one access modifier beside either interface or class!
   */

    String make="Samsung";

    void wash();
}
interface FiveG{
    void Speed();
}

interface  FastChargeAble{

    void charging();
}

class S21Ultra implements IP65,FastChargeAble,FiveG{
    /**
     *
     */
    @Override
    public void charging() {
        System.out.println("I support Fast charging now I have implemented this requirement as well");
    }

    /**
     *
     */
    @Override
    public void wash() {
        System.out.println("You guys can wash me easily no issue");

    }

    /**
     *
     */
    @Override
    public void Speed() {
        System.out.println("You can download webpages super FAST");
    }

    public static void main(String[] args) {
        S21Ultra ip65=new S21Ultra();
        ip65.wash();
        ip65.charging();
        ip65.Speed();
    }
}
