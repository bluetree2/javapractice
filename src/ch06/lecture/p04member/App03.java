package ch06.lecture.p04member;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        a.address = "qwwe";

    }
}

class MyClass03 {
    String address;

    void print() {
        System.out.println("주소: " + this.address);
    }
}
