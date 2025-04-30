package ch04.lecture;

public class C08SwitchExpression {
    public static void main(String[] args) {
        int a = 2;

        switch (a) {
            case 1 -> {
                System.out.println("실행1");
                System.out.println("실행2");
            }
            case 2 -> {
                System.out.println("실행3");
                System.out.println("실행4");
            }
            default -> {
                System.out.println("실행5");
                System.out.println("실행6");
            }
        }

        switch (a) {
            case 1:
                System.out.println("실행1");
                System.out.println("실행2");
                break;
            case 2:
                System.out.println("실행3");
                System.out.println("실행4");
                break;
            default:
                System.out.println("실행5");
                System.out.println("실행6");
                break;
        }

        // old style
        switch (a) {
            case 1, 2 -> {
                System.out.println("실행1");
            }
            case 3, 4 -> {
                System.out.println("실행2");
            }
            default -> {
                System.out.println("실행3");
            }

        }

        // 코드블럭이 한줄이면 {} 생략 가능
        switch (a) {
            case 1, 2 -> System.out.println("실행1");
            case 3, 4 -> System.out.println("실행2");
            default -> System.out.println("실행3");

        }
    }
}
