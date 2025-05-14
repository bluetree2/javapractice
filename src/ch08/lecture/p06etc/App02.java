package ch08.lecture.p06etc;

interface Myinterface02 {
    void action1();

    // default method : 인터페이스에 있는 body가 있는 메소드(추상메소드)
    default void method() {
        System.out.println("Myinterface02.method");
    }

    default void hello() {
        System.out.println("Myinterface02.hello");
    }

}

public class App02 {
}

class MyClass021 implements Myinterface02 {
    @Override
    public void action1() {
        System.out.println("MyClass021.action1");
    }

    // 필요하면 default 메소드 재정의 가능
    public void method() {
        System.out.println("MyClass021.method");
    }

    //default 메소드도 항상 public
    public void hello() {
        System.out.println("MyClass021.hello");
    }


}

class MyClass022 implements Myinterface02 {
    @Override
    public void action1() {
        System.out.println("MyClass022.action1");
    }
}
