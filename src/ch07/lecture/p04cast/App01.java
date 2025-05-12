package ch07.lecture.p04cast;

public class App01 {
    public static void main(String[] args) {
        SubClass011 a = new SubClass011();
        a.action();
        a.work();

        Superclass01 b = a;
        b.action();
//        b.work(); // x


    }

}

class Superclass01 {
    public void action() {
        System.out.println("Superclass01.action");
    }
}

class SubClass011 extends Superclass01 {
    // action 메소드 있음

    public void action() {
        System.out.println("SubClass011.action");
    }

    public void work() {
        System.out.println("SubClass011.work");

    }
}
