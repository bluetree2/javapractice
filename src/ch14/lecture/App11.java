package ch14.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class App11 {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
        List<Integer> list = new Vector<>();
        Random rand = new Random();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                list.add(rand.nextInt(100));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                list.add(rand.nextInt(100));
            }
        });


    }
}
