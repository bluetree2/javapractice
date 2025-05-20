package ch15.exercise.p08;


import java.util.Objects;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    // studentNum이 같으면 동일한 Student 가정하고 중복 저장외 되지 않도록 하기
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student target)) return false;
        return studentNum == target.studentNum;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}
