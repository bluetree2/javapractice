package ch17.lecture.ch04primitive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App01 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(3, 5, 7, 9, 11, 13, 15);

        Stream<Integer> stream1 = list1.stream();

        int[] arr1 = {3, 5, 7, 9, 11, 13, 15};
        IntStream stream2 = Arrays.stream(arr1);
        int r2 = stream2.reduce(0, (a, b) -> a + b);
        System.out.println("r2 = " + r2);

        // 기본타입을 요소로 갖는 Stream
        // IntStream
        // LongStream
        // DoubleStream

        // 유용한 reduce 메소도 : sum, average, min, max

        IntStream stream3 = Arrays.stream(arr1);
        int r3 = stream3.sum();
        System.out.println("r3 = " + r3);

    }
}
