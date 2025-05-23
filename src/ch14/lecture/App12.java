package ch14.lecture;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class App12 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
//        List<Integer> list = new Vector<>();
        List<Integer> list = Collections.synchronizedList(l);
        
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
