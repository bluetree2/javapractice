package ch08.lecture.p02method;

interface Myinterface031 {
    void action1();
}

interface Myinterface032 {
    void action3();
}

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        a.action1();
        a.action3();

        Myinterface031 b = a;
        Myinterface032 c = a;

        b.action1();
//        b.action3(); // x

//        c.action1(); // x
        c.action3();
    }
}

class MyClass03 implements Myinterface031, Myinterface032 {
    @Override
    public void action1() {

    }

    @Override
    public void action3() {

    }
}
