package ch12.practice;

import java.util.Random;
import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        // 컴퓨터와 가위바위보 게임하기
        // 1. 사용자에게 가위,바위,보 중에 키보드로 입력받기
        // 2. 컴퓨터는 랜덤하게 가위,바위,보 중에 고르기
        // 3. 사용자와 컴퓨터 간의 결과(이김 비김 짐) 출력하기
        // 4. 종료 선택시 프로그램 종료
//        int ROCK = 0;
//        int PAPER = 1;
//        int SCISSORS = 2;

        outer:
        while (true) {

            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            System.out.println("-----------------------------");
            System.out.println("1.가위 | 2.바위 | 3.보 | 4.종료");
            System.out.println("-----------------------------");
            System.out.println("선택하세요");

            int computer = random.nextInt(3);
            String user = scanner.nextLine();
            int userNum = 0;


            switch (user) {
                case "바위" -> userNum = 0 - computer;
                case "보" -> userNum = 1 - computer;
                case "가위" -> userNum = 2 - computer;
                case "종료" -> {
                    break outer;
                }
                default -> {
                    System.out.println("다시 시도해 주세요");
                    continue outer;
                }
            }

            switch (computer) {
                case 0 -> System.out.println("바위");
                case 1 -> System.out.println("보");
                case 2 -> System.out.println("가위");
            }
//            System.out.println(userNum);
            if (userNum == 0)
                System.out.println("비기셨습니다.");
            else if (userNum == -1 || userNum == 2)
                System.out.println("지셨습니다.");
            else if (userNum == 1 || userNum == -2) {
                System.out.println("이기셨습니다.");
                break;
            }
//            else System.out.println("다시 시도해 주세요");
        }

        System.out.println();

    }
}
