package ch08.lecture.p03cast;

interface MyInterface03 {
}

public class App03 {
    public static void main(String[] args) {
        MyInterface03 a = new MyClass031();
        // instanccefo 연산자: 왼족에 있는 참조면수, 오른쪽에 타입
        // 참조변수가 가리키는 인스턴스(객체) 오른쪽 타입이면 true
        // 아니면 false

        if (a instanceof MyClass031) {
            System.out.println("실행가능?1");
            MyClass031 b = (MyClass031) a; // x
        }


        if (a instanceof MyClass032) {
            System.out.println("실행가능?2");
            MyClass032 c = (MyClass032) a; // x
        }
        System.out.println("프로그램 종료");
    }
}

class MyClass031 implements MyInterface03 {
}

class MyClass032 implements MyInterface03 {
}
