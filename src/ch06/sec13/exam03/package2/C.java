package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
    public void method() {
//        객체 생성
        A a = new A();

        a.field1 = 1; // 0
//        a.field2 = 2; // 0 접근 불가
//        a.field3 = 3; // 0 접근 불가

        a.method1(); // 0
//        a.method2(); // 0 접근 불가
//        a.method3(); // 0 접근 불가
    }
}
