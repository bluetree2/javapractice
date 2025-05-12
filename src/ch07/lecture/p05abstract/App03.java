package ch07.lecture.p05abstract;

public class App03 {
}

abstract class Canids03 {
    public abstract void bark();
}

class Chihuahua03 extends Canids03 {
    @Override
    public void bark() {
        System.out.println("깨갱");
    }

    // 추상 메소드는 꼭 재정의 해야함
    abstract class Wolf03 extends Canids03 {
        @Override
        public void bark() {
            System.out.println("아우~");
        }
    }

}
