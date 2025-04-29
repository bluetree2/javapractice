package ch02.lecture;

public class C18Operatar {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int c = a + b; // int
        System.out.println("c = " + c);

        // 다른 타입끼리 산술연산(+,-,*,/)
        // 큰 타입이 연산나 결과
        int d = 10;
        long e = 20;
//        int f = d + e; // int x
        long g = d + e; //long

        int h = 3;
        double i = 3.14;
        double j = h + i; // 산술연산 결과는 큰 타입으로


        // byte, short, int 끼리의 산술연산결과는 int
        byte k = 5;
        int l = 7;
        int m = k + l; // int

        byte n = 7;
        byte o = 9;
//        byte p = n + o; // byte 7
        int q = n + o; // int 임

        int r = 5;
        int s = 3;
        int t = r / s; // 1
        System.out.println("t = " + t);

        double u = r / s;
        System.out.println("u = " + u);

        double v = r / (double) s;
        double w = (double) r / s;
        System.out.println("v = " + v);
        System.out.println("w = " + w);
    }
}
