package com.syntax.class25;

public class BankAccount {
    private String name;
    private String username;
    private String password;
    private double Balance;
    private int age;

    public void setName(String name) {
        //123Alexia                      Setter Meter(Security for input name)
        String nameWithoutNumbers = name.replaceAll("[^A-Za-z]", "");
        //Alexia
        if (nameWithoutNumbers.equals(name)) {
            System.out.println("Numbers dont present inside the name checking more rules");
            this.name = name;
        } else {
            System.out.println("only alphabets are allowed");
        }


    }

    public void setUsername(String username) {
        if (username.length() > 8 && username.length() < 15) {
            this.username = username;
        } else {
            System.out.println("User name should be greater than 8 characters or less than 15");
        }
    }

    double getBalance(String username, String password) {
if(username.equals(this.username) && username.equals(this.password)){
    return Balance;
}else{
    return -1;
}

    }
}
