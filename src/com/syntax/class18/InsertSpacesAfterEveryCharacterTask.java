package com.syntax.class18;

public class InsertSpacesAfterEveryCharacterTask {
    public static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder();
        String spaceOut = "";
        for (char c : s.toCharArray()) {
            sb.append(spaceOut).append(c);
            spaceOut = " ";
        }

        System.out.println(sb);

    }
}
