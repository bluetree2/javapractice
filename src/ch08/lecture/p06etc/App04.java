package ch08.lecture.p06etc;

interface Myinterface04 {
    default void action1() {
        System.out.println("Myinterface04.action1");
        common();
    }

    default void action2() {
        System.out.println("Myinterface04.action2");
        common();
    }

    // private 인스턴스 메소드
    private void common() {
        System.out.println("공통된 매우 길고" +
                "길고" +
                "길고" +
                "긴 코드");
    }
}

public class App04 {
    public static void main(String[] args) {
        MyClass041 a = new MyClass041();
//        a.common(); // 원하지 않는 코드

    }
}

class MyClass041 implements Myinterface04 {
}

class MyClass042 implements Myinterface04 {
}
