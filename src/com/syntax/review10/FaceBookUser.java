package com.syntax.review10;

public class FaceBookUser {
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;

    private String PrintInfo;


    public  FaceBookUser(String firstName,String lastName,String userName,String passWord ){
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
        this.passWord=passWord;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPrintInfo() {
        return firstName +" "+ lastName +" "+ userName +" "+ passWord;
    }
}



