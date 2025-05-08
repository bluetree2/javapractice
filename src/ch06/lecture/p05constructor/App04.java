package ch06.lecture.p05constructor;

import java.util.Objects;

public class App04 {
}

class myClass41 {
    String name;
    String address;
    int age;
    boolean married;

    public myClass41(String name, boolean married, int age, String address) {
        this.name = name;
        this.married = married;
        this.age = age;
        this.address = address;
    }

}

class MyClass42 {
    String name;
    String nickname;
    int age;
    boolean done;
    double score;

    public MyClass42(String name, String nickname, int age, boolean done, double score) {
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.done = done;
        this.score = score;
    }
}
