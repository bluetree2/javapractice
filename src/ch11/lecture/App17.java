package ch11.lecture;

public class App17 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("예외 발생");
        }

        System.out.println("프로그램 실행 이어감");

    }

    public static void method1() throws RuntimeException {
        // 내가 ㅓ작성하는 코드
        // exception 발생(ejswla)

        throw new RuntimeException();
    }
}
