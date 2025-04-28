package ch01.lecture;

public class C02variable {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a);

        a = 5;
        System.out.println(a);

        int b = 5;
        int c = 7;

        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // 코드 작성, b가 가지고 있는 값을 C에,
        // C가 가지고 있는 값을 b에
        int d = b;
        b = c;
        c = d;

        System.out.println("b = " + b); // 7
        System.out.println("c = " + c); // 5


    }
}
