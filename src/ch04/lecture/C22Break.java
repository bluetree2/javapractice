package ch04.lecture;

public class C22Break {
    public static void main(String[] args) {
        // break : 반복문(for, while) 종료

        while (true) {
            System.out.println("code1");
            System.out.println("code2");
            System.out.println("code3");
            if (true) break; // 반복문 종료
            System.out.println("code4");
        }
        System.out.println("code5");
    }
}
