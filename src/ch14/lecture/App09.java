package ch14.lecture;

public class App09 {
    public static void main(String[] args) throws InterruptedException {
        Box09 box = new Box09();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increseValue();
            }
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increseValue();
            }
        });
        t2.start();

        t1.join();
        t2.join();
        int value = box.getValue();
        System.out.println("value = " + value);

    }
}

class Box09 {
    private int value;
//    private Object object = new Object();

    public int getValue() {
        return value;
    }

    // synchronized method
    // : (monitor) lock (:this)을 휙득한 스레드만 실행 가능
    public synchronized void increseValue() {
        value++;
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }
}
