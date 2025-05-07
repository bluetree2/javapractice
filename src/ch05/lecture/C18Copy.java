package ch05.lecture;

import java.util.Arrays;

public class C18Copy {
    public static void main(String[] args) {
        int[][] a = {{9, 3}, {5, 7, 10}};
        int[][] b = a;
        int[][] c = {a[0], a[1]};
        int[][] d = {{a[0][0], a[0][1]}, {a[1][0], a[1][1], a[1][2]}};
        b[0][0] = 99;
        System.out.println("a = " + Arrays.toString(a[0]));
        System.out.println("b = " + Arrays.toString(b[0]));
        System.out.println("c = " + Arrays.toString(c[0]));
        System.out.println("d = " + Arrays.toString(d[0]));

        // for 문 사용해서 2차원 배열 복사
        int[][] e = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            e[i] = new int[a[i].length];
            for (int j = 0; j < a[i].length; j++) {
                e[i][j] = a[i][j];
            }
        }

        System.out.println("e[0] = " + Arrays.toString(e[0]));
        System.out.println("e[1] = " + Arrays.toString(e[1]));
        a[0][0] = 999;
        System.out.println("e[0] = " + Arrays.toString(e[0]));
        System.out.println("e[1] = " + Arrays.toString(e[1]));
    }
}
