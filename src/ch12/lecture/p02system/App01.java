package ch12.lecture.p02system;

import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        // system.in : 키도브
        Scanner scanner = new Scanner("hello world");
        String w1 = scanner.next();
        String w2 = scanner.next();
        System.out.println(w1);
        System.out.println(w2);

        scanner.close();

        //System.in : 키보드
        Scanner scanner2 = new Scanner(System.in);
        String w3 = scanner2.next();
        String w4 = scanner2.next();
        System.out.println(w3);
        System.out.println(w4);


    }
}
