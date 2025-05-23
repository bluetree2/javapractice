package ch14.sec05.exam01;

import java.awt.*;

public class SleepExample {
    public static void main(String[] args) {
        Toolkit tool = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            tool.beep();
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }
}
