package ch13.lecture;

public class App02 {
    public static void main(String[] args) {
        Box02 box = new Box02();
        box.setItem(3.14);
        Number item1 = box.getItem();
        System.out.println("item1 = " + item1);

        box.setItem(100);
        Number item2 = box.getItem();
        System.out.println("item2 = " + item2);
    }
}

class Box02 {
    private Number item;

    public Number getItem() {
        return item;
    }

    public void setItem(Number item) {
        this.item = item;
    }
}
