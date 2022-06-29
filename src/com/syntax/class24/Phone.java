package com.syntax.class24;

public abstract class Phone {


    abstract void displayPictures();
    abstract void unlock();
    void sendText(){
        System.out.println("use the messaging app to send a message");
    }
}
class Iphone extends Phone{

    /**
     *
     */
    @Override
    void displayPictures() {
        System.out.println("use photo app to display a pic");
    }

    /**
     *
     */
    @Override
    void unlock() {
        System.out.println("use FaceID to unlock the phone");
    }
}
class Samsung extends Phone{

    /**
     *
     */
    @Override
    void displayPictures() {
        System.out.println("use the gallery to display the pics");
    }

    /**
     *
     */
    @Override
    void unlock() {
        System.out.println("user Finger print sensor or face unlock to unlock your phone");
    }
}
class Tester{
    public static void main(String[] args) {
        Samsung samsung=new Samsung();
        samsung.displayPictures();
    }
}