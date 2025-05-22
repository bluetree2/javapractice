package ch17.exercise.p06;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = List.of(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        double avg = list.stream()
                .mapToDouble(Member::getAge)
                .average()
                .getAsDouble();

        double avg2 = list.stream()
                .map(Member::getAge)
                .reduce(0, Integer::sum)
                .doubleValue() / list.size();

        System.out.println("평균 나이: " + avg);
        System.out.println("평균 나이: " + avg2);
    }
}
