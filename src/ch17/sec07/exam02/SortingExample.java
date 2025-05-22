package ch17.sec07.exam02;

import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", 30),
                new Student("신용권", 10),
                new Student("유미선", 20)
        );

        list.stream()
                .sorted(Comparator.comparingInt(Student::getScore))
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted((s1, s2) -> s2.getName().compareTo(s1.getName()))
                .forEach(System.out::println);


    }
}
