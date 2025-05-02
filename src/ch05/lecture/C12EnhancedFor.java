package ch05.lecture;

public class C12EnhancedFor {
    public static void main(String[] args) {
        int[] a = {88, 55, 22, 0, 1, 2, 3};
        // for
        System.out.println("그냥 for ----");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // enhanced for
        System.out.println("향상된 for ----");
        for (int i : a) {
            System.out.println(i);
        }

        String[] b = {"java", "css", "html", "spring", "js"};
        for (String s : b) {
            System.out.println(s);
        }
    }
}
