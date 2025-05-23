package ch14.lecture;

import java.util.concurrent.atomic.AtomicInteger;

public class App10 {
    public static void main(String[] args) throws InterruptedException {
        Box10 box = new Box10();
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

class Box10 {
    private AtomicInteger value;
//    private Object object = new Object();

    public Box10() {
        value = new AtomicInteger(0);
    }

    public int getValue() {
        return value.intValue();
    }

    // synchronized method
    // : (monitor) lock (:this)을 휙득한 스레드만 실행 가능
    public void increseValue() {
        value.incrementAndGet();
    }
}
