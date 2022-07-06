package com.syntax.ArrayListHomeTasks;

import java.util.ArrayList;

//Create an arrayList of words. Remove every word that ends with “e”.

public class Words {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("Pete");
        words.add("Never");

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).endsWith("e")) {
                words.remove(words.get(i));
                i--;
            }

        } System.out.println(words);

    }
}