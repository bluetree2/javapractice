package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int loaction = subject.indexOf("프로그래밍");
        System.out.println(loaction);
        String substring = subject.substring(loaction);
        System.out.println(substring);

        loaction = subject.indexOf("자바");
        if (loaction != -1) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련없는 책이군요");
        }

        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련없는 책이군요");
        }
    }
}
