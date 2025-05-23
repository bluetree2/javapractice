package ch14.lecture;

import java.awt.*;

public class App02 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            Toolkit tool = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 10; i++) {
                tool.beep();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        for (int i = 0; i < 10; i++) {
            System.out.println("띠리링");
        }
    }
}
