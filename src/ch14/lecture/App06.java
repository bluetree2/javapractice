package ch14.lecture;

public class App06 {
    public static void main(String[] args) throws InterruptedException {
        // Thread 사용 시 주의 해야 하는 점
        // : 여러 쓰레드는 공유하는 객체의 상태를 변경 조심해야 함

        Box box = new Box();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increseValue();
            }
        });
        thread1.start();
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increseValue();
            }
        });
        thread2.start();

        thread1.join();
        thread2.join();
        int value = box.getValue();
        System.out.println("value = " + value);

    }
}


class Box {
    private int value;

    public int getValue() {
        return value;
    }

    public void increseValue() {
        value++;
    }
}