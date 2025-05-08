package ch06.lecture.p03method;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        a.action();
        a.action2();
        double b = a.action3();
        String c = a.action4();
        int d = a.action5();
        System.out.println("다음 코드들");
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
}

class MyClass03 {
    void action() {
        // 코드 ...


        // return
        // 1.메소드 종료 
        // 2.오른쪽 값 호출한 곳으로 반환

    }

    void action2() {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        if (true)
            return; // 메서드 종료
        System.out.println(4); // 실행 안됨
    }


    // 리턴 타입과 
    // return 문의 오른쪾 값 타입이 일치해야 함
    double action3() {
        System.out.println(99);
        System.out.println(88);
        return 3.14;
    }

    String action4() {
        return "hello";
    }

    int action5() {
        return 5;
    }

    int action6() {
        // 리턴타입을 명시하면 꼭 타입에 맞는 값을 리턴해야함.
        return 7;
    }

    void action7() {
        // 리턴할 값이 없다면 void 리턴타입 사용
    }

    int action8() {
        // 리턴문을 만나도록 코드 작성해야 함
        if (true) {
            return 10;
        }
        return 11;
    }
}
