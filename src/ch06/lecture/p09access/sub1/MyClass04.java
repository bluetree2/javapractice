package ch06.lecture.p09access.sub1;

public class MyClass04 {
    public String email;
    // package private
    String name;
    private int age;

    void method() {
        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("email = " + email);
    }
}


