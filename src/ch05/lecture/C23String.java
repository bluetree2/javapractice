package ch05.lecture;

public class C23String {
    public static void main(String[] args) {
        // 생성자 사용

        String a = "java";
        String b = new String("java"); // new
        System.out.println(a.equals(b));

        // char 배열
        char[] c1 = {'j', 'a', 'v', 'a'};
        String c = new String(c1);
        System.out.println(a.equals(c)); // true

        char[] c2 = {'r', 'e', 'j', 'a', 'v', 'a', 't'};
        String d = new String(c2, 2, 4);
        System.out.println(a.equals(d)); // true

        int[] e1 = {101, 106, 97, 118, 97, 99, 116, 105, 111, 110};
        String e = new String(e1, 1, 4);
        System.out.println(a.equals(e));

        byte[] f1 = {106, 97, 118, 97};
        String f = new String(f1);
        System.out.println(a.equals(f));

        byte[] g1 = {101, 106, 97, 118, 97, 99, 116};
        String g = new String(g1, 1, 4);
        System.out.println(a.equals(g));


    }
}
