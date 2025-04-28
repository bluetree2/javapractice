package ch02.lecture;

public class C10String {
    public static void main(String[] args) {
        //특수기호

        // \n : 새로운 줄
        // \t : 탭
        // \\ : 역슬래시
        // \" : 큰따옴표
        // \' : 작은따옴표
        

        String a = "abc\ndef";
        System.out.println("a = " + a);

        String b = "abc\tdef";
        System.out.println("b = " + b);

        String c = "abc\\def";
        System.out.println("c = " + c);
        
    }
}
