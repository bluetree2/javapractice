package ch05.lecture;

public class C01Array {
    public static void main(String[] args) {
        // 배열(array) : 여러 값을 담을 수 있는 자료형 (data type)

        int a;
        a = 3;
        int[] b;
        b = new int[5]; // 여러개의 값을 담을 수 있음

        // b는 5개의 int 값을 담을 수 있음
        b[0] = 9; // b의 0번 index에 9라는 값 대입
        b[1] = 8;
        b[2] = 7;
        b[3] = 77;
        b[4] = 1234;
//        b[index]
//        b[5] = 987; // 존재하지 않는 index 사용 시 오류

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);

        //연습
        // 3개의 int 값을 담을 수 있는 배열 C를 만들어보세요

        int[] C = new int[3];

        // c의 각 index에 값을 담아 보세요

        C[0] = 1;
        C[1] = 2;
        C[2] = 3;

        // c의 각 index의 값을 출력해보세요
        System.out.println(C[0]);
        System.out.println(C[1]);
        System.out.println(C[2]);

        double[] d = new double[3];

        d[0] = 1.1;
        d[1] = 2.2;
        d[2] = 3.3;
        System.out.println("d[0] = " + d[0]);
        System.out.println("d[1] = " + d[1]);
        System.out.println("d[2] = " + d[2]);
        System.out.println(d); // ?

        //
        String[] e = new String[3];
        e[0] = "hi";
        e[1] = "hello";
        e[2] = "안녕";
        System.out.println("e[0] = " + e[0]);
        System.out.println("e[1] = " + e[1]);
        System.out.println("e[2] = " + e[2]);


    }
}
