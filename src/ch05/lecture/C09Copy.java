package ch05.lecture;

public class C09Copy {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = a;
        b[0] = 10;
        System.out.println("a[0] = " + a[0]);
        System.out.println("b[0] = " + b[0]);

        // 배열 복사
        int[] c = {5, 6, 7, 8};
        int[] d = new int[c.length];

        for (int i = 0; i < c.length; i++) {
            d[i] = c[i];
        }

        System.out.println("c 전체탐색");
        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
        }

        System.out.println("d 전체탐색");
        for (int i = 0; i < d.length; i++) {
            System.out.println("d[" + i + "] = " + d[i]);
        }

        c[0] = 55;
        System.out.println("--c 전체탐색--");
        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
        }

        System.out.println("---d 전체탐색---");
        for (int i = 0; i < d.length; i++) {
            System.out.println("d[" + i + "] = " + d[i]);
        }
    }
}
