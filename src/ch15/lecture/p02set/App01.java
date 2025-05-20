package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class App01 {
    public static void main(String[] args) {
        // Set : 같은 객체를 여러 번 저장할 수 없음
        //       탐색 순서가 보장되지 않음

        Set<String> set = new HashSet<>();

        // 요쇄(element) 추가
        set.add("Java");
        boolean r1 = set.add("spring");
        System.out.println("r1 = " + r1);
        set.add("html");
        System.out.println(set);
        set.add("css");
        System.out.println(set);
        boolean r2 = set.add("spring");
        System.out.println("r2 = " + r2);
        System.out.println(set);
        set.add(null);
        System.out.println(set);
        set.add(null);
        System.out.println(set);


        // 요소 삭제
        boolean b3 = set.remove("spring");
        System.out.println("b3 = " + b3);
        set.remove("spring");
        System.out.println(set);
        set.remove(null);
        System.out.println(set);
        boolean b4 = set.remove("react");
        System.out.println("b4 = " + b4);
        System.out.println(set);


        // 요소의 갯수 확인
        int size = set.size();
        System.out.println("size = " + size);
        boolean b5 = set.isEmpty();
        System.out.println("b5 = " + b5);
        boolean b6 = !set.isEmpty();
        System.out.println("b6 = " + b6);

        // 전체 탐색하기
    }
}
