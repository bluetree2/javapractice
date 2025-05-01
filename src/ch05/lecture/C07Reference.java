package ch05.lecture;

public class C07Reference {
    public static void main(String[] args) {
        int a;
        a = 10;

        int[] b;
        b = new int[]{4, 5, 6};

        int c;
        c = a;

        c = 5;

        int[] d;
        d = b;

        d[0] = 44;

        System.out.println("a = " + a);
        System.out.println("b = " + b[0]);
        System.out.println("c = " + c);
        System.out.println("d = " + d[0]);
        /*
        a = 10
        b = 44
        c = 5
        d = 44
        */


    }
}
