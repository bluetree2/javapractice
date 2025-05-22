package ch11.lecture;

public class App07 {
    public static void main(String[] args) {

        try {
            int[] arr = {5, 0};
            // ArithmeticException
            // IndexOutOfBoundsException
            int c = arr[0] / arr[2];
            System.out.println("c = " + c);
//        } catch (Object e) { // 안됨
//        } catch (Throwable e) {
//        } catch (Exception e) {
        } catch (RuntimeException e) {
//        } catch (ArithmeticException | IndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("예외 처리 코드");
        }
    }
}
