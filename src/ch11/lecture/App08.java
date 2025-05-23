package ch11.lecture;

public class App08 {
    public static void main(String[] args) {
        try {
            //try, catch
            int[] arr = {5, 6};
            int c = arr[0] / arr[1];
            System.out.println("c = " + c);
            System.out.println("다음 코드들");
        } catch (ArithmeticException e) {
            // catch
            System.out.println("영으로 나눔");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("인덱스 넘어감");
        } finally {
            //finally
            // exception 발생 여부 관계 없이 
            // ㅓ항상 실행 되는 코드
            System.out.println("여기는 항상 실행되는 코드 블럭");

        }

        System.out.println("이어 지는 코드들...");
    }
}
