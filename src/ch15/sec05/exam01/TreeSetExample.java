package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // treeset 컬렉션 생성
        TreeSet<Integer> scores = new TreeSet<>();

        //Integer 객체 생성
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        // 정렬된 Integer 객체를 하나씩 가져오기
        for (Integer score : scores) {
            System.out.println(score + "");
        }
        System.out.println("\n");

        // 특정 Integer 객체를 가져오기
        System.out.println("가장 낮은 점수" + scores.first());
        System.out.println("가장 높은 점수" + scores.last());
        System.out.println("95점 아래 점수" + scores.lower(95));
        System.out.println("95점 위의 점수" + scores.higher(95));
        System.out.println("95점이거나 바로 아래 점수" + scores.floor(95));
        System.out.println("95점이거나 바로 위의 점수" + scores.ceiling(95));
        System.out.println();

        // 내림차순 정렬
        NavigableSet<Integer> desendingScores = scores.descendingSet();
        for (Integer s : desendingScores) {
            System.out.println(s + "");
        }


    }
}
