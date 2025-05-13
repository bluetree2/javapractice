package ch08.lecture.p01interface;

// interface : 클래스의 새로운 타입을 정의
interface MyInterface02 {
    public static void main(String[] args) {


        Child022 f = new Child022();
        Parent02 g = f;
        MyInterface01 h = f;
        MyInterface02 i = f;
    }
}


// @formatter:off
// interface : 클래스의 새로운 타입을 정의
class Parent02 {}
public class App02 {}
// 클래스 상속은 하나만 가능
class Child02 extends Parent02 {}
// 인터페이스 구현은 여러 개 가능
class MyClass02 implements MyInterface02 {}
class Child022 extends MyClass02 implements MyInterface02 {}
// @formatter:on
