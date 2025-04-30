package ch04.exercise;

public class exercise00 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int value = 0;
        int value2 = 0;
        System.out.println("실행");
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                value += i;
            } else {

            }
        }

        while (b <= 100) {
            // if 안쓰고?
            while (b % 3 == 0) {
                value2 += b;
//                System.out.printf(" %d ", b);
                b++;
            }
            b++;
        }
        System.out.println(value);
        System.out.println(value2);
    }
}
