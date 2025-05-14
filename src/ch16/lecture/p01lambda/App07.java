package ch16.lecture.p01lambda;

@FunctionalInterface
interface MyInterface07 {
    int method();
}

public class App07 {
    public static void main(String[] args) {
        MyInterface07 a = new MyInterface07() {
            @Override
            public int method() {
                // 코드데 꼭 리턴타입에 맞는 return문을 만나도록 작성
                return 1;
                // 이 코드는 생략 불가능
            }
        };

        // return 문이 하나만 있을 때 {} 생략가능, return 생략해야함
        MyInterface07 c = () -> 1;


    }
}
