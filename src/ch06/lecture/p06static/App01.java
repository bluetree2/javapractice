package ch06.lecture.p06static;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        a.name = "donald";
        a.age = 77;

        MyClass01 b = new MyClass01();
        b.name = "trump";
        b.age = 55;

        a.work();
        b.work();

        // 인스턴스 필드
//        MyClass01.name = "abc";
//        MyClass01.age = 22;

        // 클래스 멤버(필드, 메소드)는 클래스 이름으로 접근 할 수 있음
//        MyClass01
    }
}

class MyClass01 {
    // 필드(필드,메소드,(생성자))

    //클래스 필드
    static String address;

    // 필드, 멤버필드, 인스턴스필드
    String name;
    int age;

    // 메소드, 멤버 베소드, 인스턴스 메소드
    void work() {
        System.out.println(this.age + "세 의 " + this.name + "가 일한다.");
    }

    // 클래스 메소드, static 메소드(정적 메소드)
    void print() {
        System.out.println(address + "에 삽니다.");
    }
}
