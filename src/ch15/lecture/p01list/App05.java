package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App05 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("World");

        List<String> list2 = list1;
        list2.set(0, "python");
        System.out.println("list2 = " + list2);
        System.out.println("list1 = " + list1);

        List<List<String>> list3 = new ArrayList<>();
        List<String> row1 = new ArrayList<>();
        row1.add("A");
        row1.add("B");

        list3.add(row1);

        List<String> row2 = new ArrayList<>();
        row2.add("C");
        row2.add("D");

        list3.add(row2);

        System.out.println(list3);
        List<List<String>> list4 = list3;
        list4.get(0).set(0, "hola");
        System.out.println("list4 = " + list4);
        System.out.println("list3 = " + list3);

        List<List<String>> list5 = new ArrayList<>();
        list5.add(list3.get(0));
        list5.add(list3.get(1));

        System.out.println("list5 = " + list5);

        list3.get(0).set(1, "react");

        System.out.println("list5 = " + list5);
        System.out.println("list3 = " + list3);

    }
}

