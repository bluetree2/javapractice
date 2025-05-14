package ch16.lecture.p01lambda;

@FunctionalInterface
interface MyInsterface06 {
    void action();
}

public class App06 {
    public static void main(String[] args) {
        MyInsterface06 a = () -> {
            System.out.println("App06.action");
            System.out.println("App06.action");
        };

        MyInsterface06 b = () -> System.out.println("한줄코드");
        
    }
}
