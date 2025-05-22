package ch11.lecture;

public class App02 {
    public static void main(String[] args) {
        //try : exception 이 날 수 있는 코드를

        try {
            int a = 0;
            int b = 0;
            int C = b / a; // ArithmeticException
            // exception 발생시 catch 블럭으로 흐름이 넘어감

            System.out.println("프로그램 진행");
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나눌 수 없습니다.");
        } catch (Exception e) {
            System.out.println("예외 발생 시 샐행되는 코드");
        }

        System.out.println("나머지 코드들....");
    }
}
