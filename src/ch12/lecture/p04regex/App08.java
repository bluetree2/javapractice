package ch12.lecture.p04regex;

import java.util.regex.Pattern;

public class App08 {
    public static void main(String[] args) {
        // () : 그룹

        System.out.println(Pattern.matches("(\\d{3} )+", "123 123 123 123 "));
        System.out.println(Pattern.matches("(\\d{3} )+", "123 098 423 "));
        System.out.println(Pattern.matches("(\\d{3} )+", "123 456 789 "));

    }
}
