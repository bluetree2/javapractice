package ch04.lecture;

import java.util.Scanner;

public class C09SwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수 : ");
        int score = scanner.nextInt();
//        int score = Integer.parseInt(scanner.nextLine());

        String message;
        switch (score) {
            case 100 -> {
                message = "참 잘했어요";
            }
            case 90 -> {
                message = "잘했어요";
            }
            case 80 -> {
                message = "좋아요";
            }
            default -> {
                message = "아쉬워요";
            }
        }
        System.out.println(message);

        // switch expression
        // default 생략 불가
        String message2 = switch (score) {
            case 100 -> "참 잘했어요";
            case 90 -> "잘했어요";
            case 80 -> "좋아요";
            default -> "아쉬워요";
        };
        System.out.println(message2);

    }
}