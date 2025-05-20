package ch15.sec03.exam02;

import java.util.Objects;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Member target)) return false;

        return age == target.age && Objects.equals(name, target.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
//        Objects.hash(name, age);
    }
}
