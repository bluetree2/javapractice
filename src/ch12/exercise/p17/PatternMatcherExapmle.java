package ch12.exercise.p17;

import java.util.regex.Pattern;

public class PatternMatcherExapmle {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String regex = "[a-zA-Z][a-zA-Z0-9]{7,11}";
//        boolean isMatch = id.matches(regex);
        boolean isMatch = Pattern.matches(regex, id);
        if (isMatch)
            System.out.println("id로 사용할 수 있습니다");
        else
            System.out.println("id로 사용할 수 없습니다");

    }
}
