package ch13.exercise.p03;

public class Container<T, U> {
    private T contents;
    private T key;
    private U value;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public U getValue() {
        return value;
    }

    public void setValue(U value) {
        this.value = value;
    }

    public void set(T t, U u) {
        this.key = t;
        this.value = u;
    }
}
