package ch08.lecture.p06etc;

interface Myinterface03 {
    // public static final field

    // public static method
    static void action() {
        System.out.println("Myinterface03.action");
    }

    // public abstract method(instance method)

    // public default method(instance method)
}

public class App03 {
    public static void main(String[] args) {
        Myinterface03.action();
    }
}
