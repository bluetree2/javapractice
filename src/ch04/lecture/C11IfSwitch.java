package ch04.lecture;

import java.util.Scanner;

public class C11IfSwitch {
    public static void main(String[] args) {
        // if : 범위 비교

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 : ");
        int score = Integer.parseInt(scanner.nextLine());

        if (score <= 100 && score >= 80) {
            System.out.println("최우수");  
        } else if (score >= 70) {
            System.out.println("우수");
        } else if (score >= 50) {
            System.out.println("보통");
        } else if (score >= 0) {
            System.out.println("노력 필요");
        } else {
            System.out.println("점수 오류");
        }
    }
}
