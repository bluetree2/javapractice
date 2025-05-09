package ch06.lecture.p06static;

public class App03 {
    int age;
    int height;
    String name;
    String address;

    static void greeting() {
    }

    static void staticMethod() {
        // 클래스 메소드(멤버)인스턴스 멤버 접근 가능;
//        go(); // x
//        System.out.println(name); // x
    }

    void work() {
        //static 멤버 끼리 접근 가능
        System.out.println(address + ", " + height);
        greeting();
    }

    void instanceMethod() {
        greeting();
    }

    void action() {
        System.out.println(this.name + "은 " + this.age + "세다");
    }
}
