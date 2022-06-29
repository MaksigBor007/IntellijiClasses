package com.syntax.class24;

public class FileTester {
    public static void main(String[] args) {
        File[] arr={new JavaFile(),new WordFile(),new PdfFile()};
        for(File f:arr){
            f.open();
            f.edit();
            f.close();
            System.out.println();
        }


    }

}