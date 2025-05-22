package ch17.sec05;

import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list
                = List.of("홍길동", "신용권", "감자바", "신용권", "신민철");
        list.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println();

        list.stream()
                .filter(n -> n.startsWith("신"))
                .forEach(System.out::println);

        System.out.println();

        list.stream()
                .filter(n -> n.startsWith("신"))
                .distinct()
                .forEach(System.out::println);

    }
}
