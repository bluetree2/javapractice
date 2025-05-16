package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        //Box<String> box1 = new Box<String>();
        Box<String> box = new Box<>();
        box.contents = "Hello";
        String str = box.contents;
        System.out.println(str);

        // Box<Integer> box2 = new Box<Integer>();
        Box<Integer> box2 = new Box<>();
        box2.contents = 100;
        int value = box2.contents;
        System.out.println(value);
    }
}
