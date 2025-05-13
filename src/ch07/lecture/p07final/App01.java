package ch07.lecture.p07final;

public class App01 {
}

class Parent01 {
    public void aciton1() {

    }

    // final method : 재정의 불가
    final public void aciton2() {
    }
}

class Child01 extends Parent01 {

//    @Override
//    public void action2() {
//        super.aciton2();
//    }

    @Override
    public void aciton1() {
        super.aciton1();
    }

}