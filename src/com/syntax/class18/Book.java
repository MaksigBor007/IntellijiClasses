package com.syntax.class18;

public class Book {
    /*
     *Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
     *Instance variables are being initialized
     *Both Constructors are being executed
     */
    String name; String genre; double weigh; int year;
    public Book(String bookName, String bookGenre){
        name=bookName;
        genre=bookGenre;
    }
    public Book(double bookWeigh, int bookYear){
        weigh=bookWeigh;
        year=bookYear;
    } public String printInfo(){
        return "Name of a book - "+name+"."+" Genre - "+genre;
    }
    public String printSpecs(){
        return "The weigh of a book - "+weigh+"."+" The year of a book - "+year;
    }
    public static void main(String[] args){
        Book b=new Book("The Lord Of The Rings","Fantasy");
        System.out.println(b.printInfo());
        Book b1=new Book(0.75,2004);
        System.out.println(b1.printSpecs());
    }
}
