package ch09.lecture.p01nested;

public class App02 {
    public static void main(String[] args) {
        MyClass02.NestedClass01 a = new MyClass02.NestedClass01();
    }
}

class MyClass02 {
    // 필드
    NestedClass01 a = new NestedClass01();

    //생성자
    MyClass02() {
        a = new NestedClass01();
    }

    // non static nested class
    // instance nested class
    static class NestedClass01 {
    }

    class subClass02 {
    }
}
