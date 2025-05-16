package ch12.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App03 {
    public static void main(String[] args) {
        // 사용자 입력 받아서
        Scanner scanner = new Scanner(System.in);
        System.out.print("번호를 입력하세요 : ");
        // 유효한 전화번호 인지 확인
        String ableNum = "\\d{3}[-, ]?\\d{4}[-, ]?\\d{4}";
        boolean isMatch = Pattern.matches(ableNum, scanner.nextLine());


        // 아래 전화번호들은 패턴에 일치하는 것들
        // 01099998888
        // 010-9999-8888
        // 010 9999 8888
        // 010-99998888
        // 010 99998888

        if (isMatch)
            System.out.println("일치합니다");
        else
            System.out.println("일치하지 않습니다");

    }
}
