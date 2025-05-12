package ch07.lecture.p04cast;

public class App02 {
}

class Dog02 {
    public void bark() {
        System.out.println("woof");
    }
}

class GuideDog02 extends Dog02 {
    @Override
    public void bark() {
        System.out.println("guide dog");
    }

    public void guide() {
        System.out.println("길을 안내합니다");
    }
}

class Chihuahua02 extends Dog02 {
    @Override
    public void bark() {
        System.out.println("chihuahua");
    }
}
