package ch09.sec07.exam01;

public class Car {
    // 필드에 Tire 객체 대입
    private Tire tire = new Tire();

    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("tire2 rolling...");
        }
    };

    public void run1() {
        tire.roll();
        tire2.roll();
    }

    public void run2() {
        // 로컬 변수에 익명 자식 객체 타입
        Tire t = new Tire() {
            @Override
            public void roll() {
                System.out.println("t rolling...");
            }
        };
        t.roll();
    }

    // 메소드(매개변수 이용)
    public void run3(Tire t) {
        t.roll();
    }
}
