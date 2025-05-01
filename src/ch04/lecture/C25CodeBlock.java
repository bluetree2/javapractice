package ch04.lecture;

public class C25CodeBlock {
    public static void main(String[] args) {
        if (true) {
            // 코드블럭 {} 내의 코드들은 오른쪽 들여쓰기 해야함

        } else if (true)
            // 코드블럭 {} 내의 코드들은 오른쪽 들여쓰기 해야함
            // 코드블럭 내의 코드가 한 줄이면 {} 생략 가능
            System.out.println("code");
        else
            System.out.println("code");
        System.out.println("code");

        for (int i = 0; i < 10; i++) {

        }
        while (true) {
            break;
        }

        for (int i = 0; i < 10; i++) System.out.println("hi");

//        while (true) System.out.println("hi");

    }
}
