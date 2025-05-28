package etc.lecture.p03reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App02 {
    public static void main(String[] args) {
        Class<Book> c = Book.class;
        Field[] fields = c.getDeclaredFields();
        Constructor<?>[] constructors = c.getDeclaredConstructors();
        Method[] methods = c.getDeclaredMethods();// method랑 차이
        System.out.println("methods = " + methods);
        System.out.println("fields " + fields);
        System.out.println("constructors = " + constructors);

    }
}

class Book {
    private String title;
    private String price;

    public Book() {

    }

    public Book(String title, String price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
