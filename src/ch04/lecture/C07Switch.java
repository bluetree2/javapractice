package ch04.lecture;

public class C07Switch {
    public static void main(String[] args) {
        // long a = 3;
        // long 타입 사용 불가

        int a = 3;

        switch (a) {
            case 1:
                System.out.println("실행1");
                break;
            case 2:
                System.out.println("실행2");
                break;
            case 3:
                System.out.println("실행3");
                break;
            default:
                System.out.println("실행4");
                break;
        }
    }
}
