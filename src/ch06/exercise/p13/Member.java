package ch06.exercise.p13;

public class Member {
    private String id;
    private String password;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age == 88) {
            this.age = 10;
        } else {
            this.age = age;
        }
    }
}
