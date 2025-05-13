package ch08.lecture.p04api;

import ch06.lecture.p01class.MyClass02;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Object
        // Closealble
        // AutoCloseable
        // Iterator
        Object a = s;
        Closeable b = s;
        AutoCloseable c = s;
        Iterator d = s;

        // instanceof

        System.out.println(d instanceof Scanner);
        System.out.println(d instanceof Object);
        System.out.println(d instanceof Closeable);
        System.out.println(d instanceof AutoCloseable);
        System.out.println(d instanceof Iterator);
    }
}
