package com.syntax.class24;

public abstract class File {

    //Create a class File that will have the following behaviors: open, edit, close.
    // Edit and close are implemented method while open is an abstract.
    // Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    // Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc

    abstract void open();
     void edit(){
         System.out.println("File is File");
     };
     void close(){
         System.out.println("Two Files");
     };
}
class JavaFile extends File{
    /**
     *
     */
    @Override
    void open() {
        System.out.println("To open java file we need notepad++");
    }

    /**
     *
     */
    @Override
    void edit() {
        System.out.println("To edit java file we need notepad++");
    }

    /**
     *
     */
    @Override
    void close() {
        System.out.println("To close java file we need notepad++");
    }
}

class WordFile extends File{
    /**
     *
     */
    @Override
    void open() {
        System.out.println("To open word file we need Microsoft Word");
    }

    /**
     *
     */
    @Override
    void edit() {
        System.out.println("To edit word file we need Microsoft Word");
    }

    /**
     *
     */
    @Override
    void close() {
        System.out.println("To close word file we need Microsoft Word");
    }
}

class PdfFile extends  File{

    /**
     *
     */
    @Override
    void open() {
        System.out.println("To open pdf file we need Acrobat Reader");
    }

    /**
     *
     */
    @Override
    void edit() {
        System.out.println("To edit pdf file we need Acrobat Reader");
    }

    /**
     *
     */
    @Override
    void close() {
        System.out.println("To close pdf file we need Acrobat Reader");
    }
}