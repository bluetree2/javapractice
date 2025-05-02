package ch05.lecture;

public class C14Matrix {
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[4];
        a[1] = new int[4];
        a[2] = new int[4];

        // 행과 열 갯수 한 번에 정리
        int[][] b = new int[3][4];
        b[0][0] = 99;
        b[0][1] = 88;
        b[0][2] = 77;
        b[0][3] = 66;

        b[1][0] = 111;
        b[1][1] = 222;
        b[1][2] = 333;
        b[1][3] = 444;

        b[2][0] = 101;
        b[2][1] = 102;
        b[2][2] = 103;
        b[2][3] = 104;

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
            }
            System.out.println();
        }

        // 각 행마다 다른 수의 열로 생성
        int[][] c = new int[3][];
        c[0] = new int[4];
        c[1] = new int[3];
        c[2] = new int[5];

        c[0][0] = 9;
        c[0][1] = 8;
        c[0][2] = 7;
        c[0][3] = 6;

        c[1][0] = 11;
        c[1][1] = 22;
        c[1][2] = 33;

        c[2][0] = 101;
        c[2][1] = 102;
        c[2][2] = 103;
        c[2][3] = 104;
        c[2][4] = 105;

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.println("c[" + i + "][" + j + "] = " + c[i][j]);
            }
            System.out.println();
        }

        //
        int[][] d = new int[3][];
        d[0] = new int[]{9, 8, 7, 6};
        d[1] = new int[]{11, 22, 33};
        d[2] = new int[]{101, 102, 103, 104, 105};

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.println("d[" + i + "][" + j + "] = " + d[i][j]);
            }
            System.out.println();
        }

    }
}
