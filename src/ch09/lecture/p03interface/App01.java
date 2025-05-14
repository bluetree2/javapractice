package ch09.lecture.p03interface;

import ch08.lecture.p01interface.MyInterface01;

public class App01 {
    public static void main(String[] args) {
        class some implements MyClass01.MyInterface01 {
            @Override
            public void action1() {
                System.out.println("action1");
            }
        }
    }
}

class MyClass011 implements MyClass01.MyInterface01 {
    @Override
    public void action1() {

    }
}


class MyClass01 {
    // 필드
    // 생성자
    // 메소드
    void method() {
        class SomeClass implements MyInterface01 {
            @Override
            public void action1() {

            }
        }
    }

    // 클래스
    // 인터페이스
    interface MyInterface01 {
        void action1();
    }
}
