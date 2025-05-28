package etc.lecture.p04annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation05 {
    String value() default "";
}

public class App05 {
    public static void main(String[] args) {
        Class<?> c = Car.class;
        Field[] field = c.getDeclaredFields();
        MyAnnotation05 a0 = field[0].getAnnotation(MyAnnotation05.class);
        MyAnnotation05 a1 = field[1].getAnnotation(MyAnnotation05.class);

        String v0 = a0.value();
        String v1 = a1.value();

        System.out.println("v0 = " + v0);
        System.out.println("v1 = " + v1);

    }
}

class Car {
    @MyAnnotation05("tesla")
    private String name;
    @MyAnnotation05
    private int price;
}
