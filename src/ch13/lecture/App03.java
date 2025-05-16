package ch13.lecture;

public class App03 {
    public static void main(String[] args) {
        Box03 box = new Box03();
        box.setItem(3.14);
        Object item1 = box.getItem();
        System.out.println("item1 = " + item1);

        box.setItem(99);
        Object item2 = box.getItem();
        System.out.println("item2 = " + item2);
//        if (item2 instanceof String) {
//            String x = (String) item2; // ClassCastException
//            x.toUpperCase();
//        }

        box.setItem("java");
        Object item3 = box.getItem();
        System.out.println("item3 = " + item3);

//        if (item3 instanceof String) {
//            String item = (String) item3; // ClassCastEitemception
//            item.toUpperCase();
//        }

        String item = (String) item3;
        String u = item.toUpperCase();
        System.out.println("u = " + u);
    }
}

class Box03 {
    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
