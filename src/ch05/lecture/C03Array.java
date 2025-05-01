package ch05.lecture;

public class C03Array {
    public static void main(String[] args) {
        int[] a = new int[5];

        // 배열에 값을 넣지 않으면 0
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        double[] d = new double[3];
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }

        String[] s = new String[3];
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        boolean[] b = new boolean[3];
        for (int i = 0; i < b.length; i++) {

        }

        // String[] 배열의 각 index 기본값은 null
        String[] str = new String[3];
//        str[0] = null;
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }


    }
}
