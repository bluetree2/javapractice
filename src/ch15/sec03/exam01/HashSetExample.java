package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 컬렉션 생성
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Spring");
        set.add("HTML");
        set.add("Java");
        set.add("JavaScript");

        int size = set.size();
        System.out.println("총 객체 수: " + size);

        System.out.println(set);
    }
}
