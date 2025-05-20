package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App04 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");
        System.out.println("list1 = " + list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        System.out.println("list2 = " + list2);

        List<List<String>> list3 = new ArrayList<>();
        List<String> row1 = new ArrayList<>();
        row1.add("A");
        row1.add("B");

        List<String> row2 = new ArrayList<>();
        row2.add("C");
        row2.add("D");
        System.out.println("list3 = " + list3);

        list3.add(row1);
        list3.add(row2);

        System.out.println("list3 = " + list3);


    }
}
