package ch16.lecture.p01lambda;

interface MyInterface {
    void method1();

    void method2();
}

public class App01 {
    public static void main(String[] args) {
        MyInterface a = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("method1");
            }

            @Override
            public void method2() {
                System.out.println("method2");
            }
        };
    }
}
