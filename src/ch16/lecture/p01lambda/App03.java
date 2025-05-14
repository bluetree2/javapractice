package ch16.lecture.p01lambda;

public class App03 {
    public static void main(String[] args) {
        MyInterface02 a = () -> {
            System.out.println("App03.method1");
            System.out.println("App03.method2");
        };
        a.method1();

        MyInterface02 b = () -> {
            System.out.println("App03.method1");
            System.out.println("App03.method2");
        };
        b.method1();

        // method body가 한 줄이면 {} 생략 가능
        MyInterface02 c = () -> System.out.println("App03.method1");
        c.method1();

    }
}
