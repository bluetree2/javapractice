package ch11.lecture;

public class App01 {
    public static void main(String[] args) {
//        String a = null;
//        int length = a.length(); // nullpointerException

        int a = 0;
        int b = 0;
        int c = b / a; // ArithmeticException 0으로 나눔

        int[] arr = {3, 4};
        System.out.println(arr[2]);// IndexOutOfBoundsException 존재하지 않는 인덱스 참조

        Object d = "java";
        Integer e = (Integer) d; // ClassCastException  잘못된 형변환

        System.out.println("프로그램 진행");
    }
}
