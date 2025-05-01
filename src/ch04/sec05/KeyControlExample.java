package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while (run) {
            System.out.println("--------------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("--------------------------------");
            System.out.print("선택 : ");
            // 텍스트 출력

            String strNum = scanner.nextLine();
            // 입력 받은 문자열 저장       

        
            if (strNum.equals("1")) {
                speed++;
                // 속도 증가
                System.out.println("현재 속도 = " + speed);
                // 현재 속도 저장 및 출력
            } else if (strNum.equals("2")) {
                speed--;
                // 속도 감소
                System.out.println("현재 속도 = " + speed);
                // 현재 속도 저장 및 출력
            } else if (strNum.equals("3")) {
                run = false;
                // 프로그램 종료
            } else{
                System.out.println("다시 입력해 주세요");
            }
        }
        System.out.println("프로그램 종료");
    }
}
