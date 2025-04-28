package ch02.sec01;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // 정밀도 확인
        float var1 = 0.1234123123121f;
        double var2 = 0.1234123123123;
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        //10의 거듭제곱 리터럴
        double var3 = 3e6;
//        double var3 = 3.0 * 1000000;
        float var4 = 3e6F;
//        float var4 = 3.0f * 1000000;

        double var5 = 2e-3;
//        double var5 = 2 * 0.001;

        System.out.println("var3 = " + var3);
        System.out.println("var4 = " + var4);
        System.out.println("var5 = " + var5);
    }
}
