package ch04.lecture;

public class C03ElseIf {
    public static void main(String[] args) {
        // else if : 이전 조건이 false일 때 다시 조건 검사

        if(true) {
            // 조건이 true일 때 실행
            System.out.println("조건1 실행");
        } else if (true) {
            // 이전 조건이 false이고 조건이 true일 때 실행
            System.out.println("조건2 실행");
        } else if (true) {
            // 이전 조건이 false이고 조건이 true일 때 실행
            System.out.println("조건3 실행");
        } else if (true) {
            // 이전 조건이 false이고 조건이 true일 때 실행
            System.out.println("조건4 실행");
        } else {
            // 이전 조건이 모두 false일 때 실행
            System.out.println("조건5 실행");
        }
    }
}
