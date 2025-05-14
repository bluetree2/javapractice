package ch08.lecture.p06etc;

interface Myinterface05 {
    static void action1() {
        System.out.println("Myinterface05.action1");
    }

    static void action2() {
        System.out.println("Myinterface05.action2");
    }

    // private static method
    private static void common() {
        System.out.println("매우 긴 코드");
    }

}

public class App05 {

}
