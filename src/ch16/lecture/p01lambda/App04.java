package ch16.lecture.p01lambda;

interface MyInterface04 {
    MyInterface04 a = new MyInterface04() {
        @Override
        public void action(int a, String b) {
            System.out.println(b + ", " + a);
        }
    };

    void action(int a, String b);
}

public class App04 {
    public static void main(String[] args) {
        // 이 코드는 잘 안써서 거의 볼 일이 없음
        MyInterface04 a = (int x, String b) -> {
            System.out.println(b + ", " + x);
        };

        MyInterface04 c = (x, y) -> {
            System.out.println(y + ", " + x);
        };

        MyInterface04 d = (x, y) -> System.out.println(y + ", " + x);

    }

}
