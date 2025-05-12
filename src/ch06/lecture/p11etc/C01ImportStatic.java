package ch06.lecture.p11etc;

import java.util.List;
import java.util.Scanner;

// static import : static member를 클래스 명시 없이 ㅓ사용 가능


public class C01ImportStatic {
    public static void main(String[] args) {
        // 다른 패키지에 있는 클래스 사용할 때 import
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new java.util.ArrayList<>();

        Math.random();

    }
}
