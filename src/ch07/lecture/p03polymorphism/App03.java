package ch07.lecture.p03polymorphism;

public class App03 {
    public static void main(String[] args) {
        Dog01 a = new Dog01();
        Bulldog01 b = new Bulldog01();
        Chihuahua01 c = new Chihuahua01();
        a.bark(); // woof
        b.bark(); // 으르렁
        c.bark(); // 깽깽

        Dog01 d = b; // ok
        d.bark(); // 으르렁 (실제 인스턴스의 메소드가 실행) *중요!*
        Dog01 e = c; // ok
        e.bark();
    }
}
 
class Dog01 {
    public void bark() {
        System.out.println("woof");
    }
}

class Bulldog01 extends Dog01 {
    @Override
    public void bark() {
        System.out.println("으르렁");
    }
}

class Chihuahua01 extends Dog01 {
    @Override
    public void bark() {
        System.out.println("깽깽");
    }
}
