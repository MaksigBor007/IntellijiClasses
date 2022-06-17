package com.syntax.class18;

public class ReplaceAllCharTask {
    //Replace all instances of given character with a "*" within the given String.
    //censorLetter("computer science",'e') ==> "comput*r sci*nc*"
    //censorLetter("trick or treat",'t') ==> "*rick or *rea*"
    String censorLetter(String a, char b){
        return a.replaceAll(String.valueOf(b),"*");
    }
    public static void main(String[] args){
        ReplaceAllCharTask m=new ReplaceAllCharTask();
        System.out.println(m.censorLetter("computer science",'e'));
        System.out.println(m.censorLetter("trick or treat",'t'));


    }
}

