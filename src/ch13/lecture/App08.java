package ch13.lecture;

interface MyInterface08<T> {
    T action();

    void method(T param);
}

public class App08 {
    public static void main(String[] args) {
        Child081<Integer> c = new Child081<>();
    }
}

class Parent08<T> {
}

class Child081<T> extends Parent08<T> {
}

class Child082<T, U> extends Parent08<T> {
}

class Child083 extends Parent08<Integer> {
}
