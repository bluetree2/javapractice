package ch09.exercise.p06;

import javax.sound.sampled.FloatControl;

public class Anonymous {
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            System.out.println("run");
        }
    };

    void method1() {
        Vehicle v = new Vehicle() {
            @Override
            public void run() {
                System.out.println("method1");
            }
        };
        v.run();
    }

    void method2(Vehicle v) {
        v.run();
    }
}
