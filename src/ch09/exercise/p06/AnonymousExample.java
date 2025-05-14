package ch09.exercise.p06;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous a = new Anonymous();
        a.field.run();
        a.method1();
        a.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("method2");
            }
        });
    }
}
