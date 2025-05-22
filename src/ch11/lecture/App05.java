package ch11.lecture;

public class App05 {
    public static void main(String[] args) {

        try {
            int[] arr = {5, 0};
            // IndexoutOfBoundsException
            // AritheticException
            int r = arr[1] / arr[0];
            System.out.println("다음 코드.");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("배열의 인데스 참조 잘못됬을 때");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("0으로 나눌 때");
        }

        System.out.println("나머지 코드들..");
    }
}
