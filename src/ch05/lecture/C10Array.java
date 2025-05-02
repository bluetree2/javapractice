package ch05.lecture;

import java.util.Arrays;

public class C10Array {
    public static void main(String[] args) {
        // arrays : 배열을 조작한느 유용한 메소드를 가진 클래스


        // copyOf
        int[] a = {8, 1, 2};
        int[] b = Arrays.copyOf(a, a.length);

        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] : " + b[i]);
        }

        // toString : 배열 내의 값들로 문자열 생성해서 리턴
        String str = Arrays.toString(a);
        String str2 = Arrays.toString(b);
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        // fill : 특정 값으로 배열을 채움
        int[] c = new int[5];
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));
        Arrays.fill(c, 10);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));

        // sort : 배열 내의 값을 정렬함
        int[] d = {5, 3, -2, 4, 1, 0};
        System.out.println("Arrays.toString(d) = " + Arrays.toString(d));
        Arrays.sort(d);
        System.out.println("Arrays.toString(d) = " + Arrays.toString(d));

        // equals : 두 배열의 값과 순서 같은 지 확인
        int[] e = {5, 7, 9};
        int[] f = {9, 7, 5};
        boolean r1 = Arrays.equals(e, f);
        System.out.println("r1 = " + r1);
        Arrays.sort(f);
        boolean r2 = Arrays.equals(e, f);
        System.out.println("r2 = " + r2);

    }
}
