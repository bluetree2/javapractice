package ch04.exercise;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        //while scanner nextline 사용
        Scanner scanner = new Scanner(System.in);
        String value;
        String value2;
        int money = 0;
        do {
            System.out.println("--------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("--------------------------------");
            System.out.print("선택 : ");
            value = scanner.nextLine();
            switch (value) {
                case "1" -> {
                    System.out.print("예금액 : ");
                    value2 = scanner.nextLine();
                    money += Integer.parseInt(value2);
                }
                case "2" -> {
                    System.out.print("출금액 : ");
                    value2 = scanner.nextLine();
                    money -= Integer.parseInt(value2);
                }
                case "3" -> {
                    System.out.println("잔고 : " + money);
                }
                case "4" -> {
                    break;
                }
                default -> System.out.println("다시 입력해 주세요");
            }
        } while (!value.equals("4"));
    }
}
