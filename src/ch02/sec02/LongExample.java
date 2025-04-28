package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
//        long var3 = 1000000000000000000; // 컴파일러는 int로 간주해서 오류
//        underscoer(underbar)로 자릿수 표시 가능
        long var4 = 1_000_000_000_000_000_000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
