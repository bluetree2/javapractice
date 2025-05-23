package ch11.lecture;

public class App19 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (HungryException e) {
            throw new RuntimeException(e);
        }
    }

    public static void method1() throws RuntimeException {
        throw new RuntimeException("점심 때라 배고파");
    }
}

//직접 필요한  Exception 만들어서 사용 가능
class HungryException extends RuntimeException {
    HungryException() {
        super("그냥 배고파");
    }

    HungryException(String msg) {
        super(msg);

    }

}
