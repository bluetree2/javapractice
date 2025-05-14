package ch16.lecture.p01lambda;

@FunctionalInterface
interface MyInterface05 {
    void action(int a);
}

public class App05 {
    public static void main(String[] args) {
        MyInterface05 a = (x) -> {
            System.out.println(x + "이다");
            System.out.println(x + "입니다");
        };

        // 파라미터 목록이 하나면 ()도 생략 가능
        MyInterface05 s = x -> {
            System.out.println(x + "이다");
            System.out.println(x + "입니다");
        };

        MyInterface05 t = x -> System.out.println(x + "이다");
    }
}
