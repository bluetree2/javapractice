package ch06.lecture.p09access;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        a.name = "java"; // ok
        a.address = "seoul"; // ok


    }
}

class MyClass03 {
    public String name;
    String address;
    //    package private String address; // 위와 같은 내용 
    private int age;


    void action() {
        System.out.println("age = " + age);
        System.out.println("name = " + name);
    }

}
