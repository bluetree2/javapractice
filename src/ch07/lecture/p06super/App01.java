package ch07.lecture.p06super;

public class App01 {
    public static void main(String[] args) {
        Child01 a = new Child01();
        a.method1();
    }
}

class Parent01 {
    public void action1() {
    }

    public void action2() {
        System.out.println("부모의 액션2");
    }

    public void action3() {

    }
}

class Child01 extends Parent01 {
    @Override
    public void action2() {
        System.out.println("재정의한 액션2");
    }

    @Override
    public void action3() {
        super.action3();
        //  추가할 일..
        System.out.println("추가된 코드");

    }

    public void method1() {
        this.method2();
        method2();
        this.action1();
        action1();
        this.action2();
        action2();

        // 부모의 메소드
        super.action2();

        // super : 부모의 멤버에 접근하기 위한 키워드
    }

    public void method2() {

    }


}
