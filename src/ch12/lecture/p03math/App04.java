package ch12.lecture.p03math;

import ch02.sec10.PrimitiveAndStringConversionExample;

import java.util.Random;
import java.util.Scanner;

public class App04 {
    public static void main(String[] args) {
        // 컴퓨터와 가위바위보 게임
        System.out.println("가위바위보 게임 시작");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("가위 바위 보 중에 선택");
            System.out.println("1.가위 2.바위 3.보");
            System.out.println("입력");
            scanner.nextLine();
            String user = scanner.nextLine();
            int u = Integer.parseInt(user);

            if (u == 4) {
                break;
            }

            Random random = new Random();
            int com = random.nextInt(3) + 1;
            switch (com) {
                case 1 -> System.out.println("컴퓨터 : 가위");
                case 2 -> System.out.println("컴퓨터 : 바위");
                case 3 -> System.out.println("컴퓨터 : 보");
            }


            if (u == com) {
                //비김
                System.out.println("비겼습니다.");
            } else if (u == 1 && com == 3 || u == 3 && com == 1 || u == 2 && com == 1 || u == 1 && com == 2) {
                // 이김
                System.out.println("이겼습니다.");
            } else if (u == 2 && com == 3 || u == 3 && com == 2 || u == 3 && com == 3) {
                // 짐
                System.out.println("지셨습니다.");
            }

        }
    }

}

