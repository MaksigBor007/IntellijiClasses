package com.syntax.class26;

import java.util.ArrayList;

public class Demo4 {

    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Maksym");
        names.add("Kirill");
        names.add("Alladin");
        names.add("Genna");
        System.out.println(names);

        names.remove("Genna");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
        
    }
}
