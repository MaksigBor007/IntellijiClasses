package com.syntax.class24;

public abstract class DateBase {

    abstract void open();
    abstract void readDate();
    abstract boolean writeDate();
    public void closeTheDataBase(){
        System.out.println("Terminate the connection to close it");
    }
}
class Informix extends DateBase{


    /**
     *
     */
    @Override
    void open() {
        System.out.println("opening the Informix DateBase class");
    }

    /**
     *
     */
    @Override
    void readDate() {
        System.out.println("reading the date from Informix");
    }

    /**
     * @return
     */
    @Override
    boolean writeDate() {
        return false;
    }
}
class MySQLServer extends DateBase{

    /**
     *
     */
    @Override
    void open() {
        System.out.println("opening the MySQLServer DateBase class");
    }

    /**
     *
     */
    @Override
    void readDate() {
        System.out.println("reading the date from MySQLServer");
    }

    /**
     * @return
     */
    @Override
    boolean writeDate() {
        return false;
    }
}