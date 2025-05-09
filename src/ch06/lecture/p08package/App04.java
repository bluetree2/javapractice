package ch06.lecture.p08package;

import ch06.lecture.p08package.sub1.Myclass01;

import java.util.Scanner;

// java.lang 패키지는 import 도 생략 가능
//import java.lang.System;
//import java.lang.String;

public class App04 {
    public static void main(String[] args) {
        // 다른 패키지에 있는 클래스는 full name를 써야 함
        // import하면 생략 가능
        Myclass01 a = new Myclass01();

        //예제 java.util.Scanner
        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
        Scanner sc2 = new Scanner(System.in);

        // 예제 Java.lang.String
        java.lang.String s = "hello";
    }
}
