package ch12.sec12;

public class Service {
    @PrintAnnotation
    public void mehtod1() {
        System.out.println("실행 내용");
    }

    @PrintAnnotation("*")
    public void method2() {
        System.out.println("실행 내용2");
    }

    @PrintAnnotation(value = "#", number = 20)
    public void method3() {
        System.out.println("실행 내용3");
    }
}
