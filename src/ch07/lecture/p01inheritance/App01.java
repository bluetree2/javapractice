package ch07.lecture.p01inheritance;

public class App01 {
    public static void main(String[] args) {
        SubClass011 a = new SubClass011();
        a.age = 10;
        a.name = "john";
        System.out.println("a.age = " + a.age);
        System.out.println("a.name = " + a.name);
        a.action();
        a.greeting();

        SubClass012 b = new SubClass012();
        b.age = 20;
        b.address = "ny";
        System.out.println("b.age = " + b.age);
        System.out.println("b.address = " + b.address);
        b.action();
//        b.greeting()
        b.go();

        MyClass01 c = new MyClass01();
        c.age = 30;
//        c.name();
//        c.address();
        System.out.println("c.age = " + c.age);
        c.action();


    }
}

class MyClass01 {
    // 부모 클래스(parent class)
    // 상위 클래스(
    public int age;

    public void action() {

    }
}

//class MyClass02 {
//
//}

class SubClass011 extends MyClass01 {
    // 자식 클래스(child class)
    // 하위 클래스(sub class)
    // 하나의 자식 클래스가 여러 부모 클래스를 둘 수 없음 // 언어마다 다름, java는 안됨
    // 하나의 부모 클래스가 여러 자식 클래스를 둘 수 있음

    // 멤버 추가
    // field
    public String name;

    // method
    public void greeting() {

    }

}

class SubClass012 extends MyClass01 {

    // 자식 클래스에 추가할 멤버
    //field
    public String address;

    // method
    public void go() {
    }
}