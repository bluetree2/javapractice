package ch05.lecture;

public class C15Matrix {
    public static void main(String[] args) {
        int[] a;
        a = new int[]{3, 4, 5};

        int[][] b;
        b = new int[][]{{99, 88, 77}, {4, 5}, {101, 202, 303, 404}};

        int[][] d = new int[][]{
                {99, 88, 77},
                {4, 5},
                {101, 202, 303, 404}
        };

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("b[%d][%d] = %d\n", i, j, b[i][j]);
            }
        }
    }
}
