package ch05.lecture;

public class C04Array {
    public static void main(String[] args) {
        // 초기값 안젛으면 0, false, null
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d] : %d\n", i, a[i]);
        }

        int[] b = new int[]{99, 55, 22};
        for (int i = 0; i < b.length; i++) {
            System.out.printf("b[%d] : %d\n", i, b[i]);
        }

        double[] c = new double[]{99.9, 55.5, 33.3, 22.2};
        for (int i = 0; i < c.length; i++) {
            System.out.printf("c[%d] : %f\n", i, c[i]);
        }

        // 연습
        // "hi","hello","안녕","곤니찌와","hala"를 
        // 초기값으로 갖는 String 배열 만들고
        // 모든 값 출력해보기
        String[] d = new String[]{"hi", "hello", "안녕", "곤니찌와", "hala"};
        for (int i = 0; i < d.length; i++) {
            System.out.printf("d[%d] : %s\n", i, d[i]);
        }
    }
}
