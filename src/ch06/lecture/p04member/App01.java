package ch06.lecture.p04member;

public class App01 {
    public static void main(String[] args) {
        myClass01 a = new myClass01();
        myClass01 b = new myClass01();
        a.age = 30;
        b.age = 50;

        System.out.println("a.age = " + a.age);
        System.out.println("b.age = " + b.age);

        a.action();
        b.action();

        a.print();
    }
}

class myClass01 {
    // 멤버 : 필드,메소드,(생성자)
    // 멤버끼리 서로 사용할 수 있다.

    // 필드
    int age;

    // 메소드
    void print() {
        System.out.println("나이: " + age);
        action();
    }

    void action() {
        System.out.println("action!");
    }
}
