package ch02.lecture;

public class C13Scope {
    public static void main(String[] args) {

        int a = 3;

        System.out.println("a = " + a);

        if (true) {
            int b = 5;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        System.out.println("a = " + a);
//        System.out.println("b = " + b); // x


        if (true) {
            int b = 7;
//            int a = 9;
            System.out.println("b = " + b);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
//        System.out.println("i = " + i); // x

        int i = 0;
        for (; i < 3; i++) {
            System.out.println("a = " + a);
        }
    }
}
