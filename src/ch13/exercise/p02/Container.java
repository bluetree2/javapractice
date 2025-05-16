package ch13.exercise.p02;

public class Container<T> {
    private T item;

    public void set(T t) {
        item = t;
    }

    public T get() {
        return item;
    }
}
