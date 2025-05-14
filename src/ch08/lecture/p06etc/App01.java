package ch08.lecture.p06etc;

interface Myinterface01 {
    // public static final 필드
    int AGE = 1;
    String HOME_ADDRESS = "seoul";

    // public 추상 메소드
}

public class App01 {
    public static void main(String[] args) {
        System.out.println(Myinterface01.AGE);
        System.out.println(Myinterface01.HOME_ADDRESS);
    }
}
