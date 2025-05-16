package ch12.lecture.p05wrapper;

public class App04 {
    public static void main(String[] args) {
        book1 b1 = new book1();
        System.out.println("b1.getTitle() = " + b1.getTitle());
        System.out.println("b1.getPrice() = " + b1.getPrice());

        System.out.println();
        book2 b2 = new book2();
        System.out.println("b2.getTitle() = " + b2.getTitle());
        System.out.println("b2.getPrice() = " + b2.getPrice());


    }
}

class book2 {
    private String title;
    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class book1 {
    private String title;
    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
