package ch02.lecture;

public class C08Boolean {

    public static void main(String[] args) {
        // boolean (논리형, 불리언, 불형)
        // 1byte, 8bit

        // 가능한 값 : true, false

        boolean a;
        a = true;
        System.out.println("a = " + a);

        if (a) {
            System.out.println("true면 실행");
        }
        a = true;
        if (a) {
            System.out.println("true면 실행2");
        }

    }
}
