package ch05.lecture;

import java.util.Arrays;

public class C16Reference {
    public static void main(String[] args) {
        // 1차원 배열


        // 참조값
        int[] a = {7, 5};
        int[] b = a;
        a[0] = 77;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // 배열 복사
        int[] c = {9, 2};
        int[] d = {c[0], c[1]};
        c[0] = 99;
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));

        // 2차원 배열
        // 참조값 복사
        int[][] e = {{8, 5}, {10, 20}};
        int[][] f = e;
        // 배열 자체를 집어넣어서 e를 바꿔도 f값이 바뀜
        e[0][0] = 88;
        System.out.println(Arrays.toString(e[0]));
        System.out.println(Arrays.toString(f[0]));

        //배열 복사
        int[][] g = {{5, 1}, {6, 8}};
        int[][] h = {g[0], g[1]};
//        h[0] = g[0];
//        h[1] = g[1];
//        주소값으로 저장한 값을 넣었기 때문에 g를 바꾸면 h도 바뀐다
        g[0][0] = 55;
        System.out.println(Arrays.toString(g[0])); // 55,1
        System.out.println(Arrays.toString(h[0])); // 5, 1

    }
}
