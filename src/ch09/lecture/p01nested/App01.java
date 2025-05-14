package ch09.lecture.p01nested;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        MyClass01.subClass01 b = a.new subClass01(); // 거의 볼 수 없는 코드
    }
}

class MyClass01 {

    // 필드
    subClass01 a = new subClass01();

    // 생성자
    MyClass01() {
        a = new subClass01();
    }

    // 메소드
    void method01() {
        a = new subClass01();
    }

    // 클래스
    class subClass01 {

    }
}
