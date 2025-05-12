package ch07.lecture.p05abstract;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Objects;

public class App04 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        AbstractList b = a;
        AbstractCollection c = a;
        Object d = a;

        System.out.println(a instanceof ArrayList); // true;
        System.out.println(a instanceof AbstractList);
        System.out.println(a instanceof AbstractCollection);
        System.out.println(a instanceof Object);

        System.out.println(b instanceof ArrayList); // true;
        System.out.println(b instanceof AbstractList);
        System.out.println(b instanceof AbstractCollection);
        System.out.println(b instanceof Object);

        System.out.println(c instanceof ArrayList); // true;
        System.out.println(c instanceof AbstractList);
        System.out.println(c instanceof AbstractCollection);
        System.out.println(c instanceof Object);
    }
}
