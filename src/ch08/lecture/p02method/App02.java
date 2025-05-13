package ch08.lecture.p02method;

interface Myinterface02 {
    // interface 의 대부분 메소드는 public abstract 메소드
    public abstract void action1();

    void action2();

    abstract void action3();

    public void action4();
}

public class App02 {
}

class MyClass02 implements Myinterface02 {
    @Override
    public void action1() {
        System.out.println("action1");
    }

    @Override
    public void action2() {
        System.out.println("action2");
    }

    @Override
    public void action3() {
        
    }

    @Override
    public void action4() {

    }
}
