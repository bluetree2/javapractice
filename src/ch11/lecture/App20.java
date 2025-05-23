package ch11.lecture;

public class App20 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (AngryExcption e) {
            throw new RuntimeException(e);
        }
    }

    public static void method1() throws AngryExcption {
        throw new AngryExcption("직접 메시지 작성");
    }
}

// 필요해서 직접 만든 Exception(checked exception)
class AngryExcption extends Exception {
    public AngryExcption() {
        super("기본 메시지");
    }

    public AngryExcption(String message) {
        super(message);
    }

}
