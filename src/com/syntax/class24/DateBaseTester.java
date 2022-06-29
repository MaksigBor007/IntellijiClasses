package com.syntax.class24;

public class DateBaseTester {
    public static void main(String[] args) {
        DateBase[] databases={new Informix(),new MySQLServer()};
        for (DateBase database:databases){
            database.open();
            database.readDate();
            database.closeTheDataBase();

        }
    }
}
