package com.syntax.review10;

public class FaceBookTester {

    public static void main(String[] args) {
        FaceBookUser faceBookUser=new FaceBookUser("Maks","Bor","Maks6789","pass2222");
        faceBookUser.setFirstName("Maksym123");
        System.out.println(faceBookUser.getPrintInfo());

        System.out.println(faceBookUser);

    }
}
