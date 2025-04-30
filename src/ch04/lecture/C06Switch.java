package ch04.lecture;

public class C06Switch {
    public static void main(String[] args) {
        //switch : 특정변수의 값에 따라 실행 흐름을 변경

        int v = 10;

        switch (v) {
            case 10:
                System.out.println("실행1");
                break; // 코드 블럭 효과
            case 20:
                System.out.println("실행2");
                break;
            case 30:
                System.out.println("실행3");
                break;
            default:
                // 일치하는 case가 없을 때 실행
                System.out.println("실행4");
                break;
        }

    }
}
