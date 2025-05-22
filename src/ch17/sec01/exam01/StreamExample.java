package ch17.sec01.exam01;

import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = Set.of("hong", "shin", "java");

        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));

        set.stream()
                .forEach(System.out::println);

        for (String s : set) {
            System.out.println(s);
        }
    }
}
