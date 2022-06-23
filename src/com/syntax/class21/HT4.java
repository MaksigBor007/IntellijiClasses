package com.syntax.class21;

public class HT4 {
    //Create 1 class with a private method that has 3 overloaded forms.
    //Then call each overloaded method with specific arguments and observe result.

    private String method() {
        return "empty";
    }

    private String method(String name, int number) {
        return "2 parameters - " + name + " " + number;
    }

    private String method(int number, String name) {
        return "Verse visa of the parameters - " + number + " " + name;
    }
}

    class HT4Tester {
        public static void main(String[] args) {
            HT4 ht4 = new HT4();
             //System.out.println(ht4.method());           Can not be called due to the private modifier does not let access to
            //System.out.println(ht4.method("Maks",25));    different class other than where the method has been created!!!
            //System.out.println(ht4.method(25, "Maks"));

        }
    }

