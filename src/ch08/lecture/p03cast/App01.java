package ch08.lecture.p03cast;

interface MyInterface01 {
    void action();
}

public class App01 {
    public static void main(String[] args) {
        MyInterface01 obj = new MyClass01();
        obj.action();
//        obj.method(); // x

        // casting : 강제형변환
        MyClass01 a = (MyClass01) obj;
        a.method();
    }
}

class MyClass01 implements MyInterface01 {
    @Override
    public void action() {

    }

    public void method() {
    }
}