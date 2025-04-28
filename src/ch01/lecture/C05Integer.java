package ch01.lecture;

public class C05Integer {
    public static void main(String[] args) {
        //정수형
        //byte (1 byte)
        byte a;
        a = 127; // 최대값
        System.out.printf("a = %d\n", a);
        a = -128; // 최소값
        System.out.printf("a = %d\n", a);
//        a = 128; // x
//        a = -129; // x

        //short (2 byte)
        short b;
        b = 32767; // 최대값
        System.out.printf("b = %d\n", b);
        b = -32768; // 최소값
        System.out.printf("b = %d\n", b);

        //int (4 byte)
        int c;
        c = 2147483647;
        System.out.printf("c = %d\n", c);
        c = -2147483648;
        System.out.printf("c = %d\n", c);


        //long (8 byte)
        long d;
        d = 9223372036854775807L;
        d = -9223372036854775808L;

        //java 코드에서 정수 literal는 int로 해석
        // long type literal 은 끝에 L(l) 붙여야 함
    }
}
