package ch13.sec03.exam01;

public class GenericExample {
    //제네릭 메소드
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        //제네릭 메소드 호출
        Box<String> box = boxing("Hello");
        String str = box.get();
        System.out.println(str);

        //제네릭 메소드 호출
        Box<Integer> box2 = boxing(100);
        int value = box2.get();
        System.out.println(value);
    }
}
