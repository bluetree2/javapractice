package ch21.sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class VarExample2 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("신동권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String name = entry.getKey();
            Integer score = entry.getValue();
            System.out.println(name + " : " + score);
        }
    }

    public static void method2() {
        var map = new HashMap<String, Integer>();
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);

        var entrySet = map.entrySet();
        var iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            var name = entry.getKey();
            var score = entry.getValue();
            System.out.println(name + " : " + score);
        }
    }
}
