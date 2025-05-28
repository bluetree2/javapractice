package etc.lecture.p04annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation04 {

    //element, attribute 속성
    String name();

    int age();

}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation07 {
    String[] name() default "donald";

    String address() default "seoul";

    int age() default 0;

    String[] value() default "";
}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation06 {
    String[] name();
}


@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation05 {
    String address() default "busan";

    int age();

}


public class App04 {
    @MyAnnotation04(name = "trump", age = 99)
    public void method() {

    }

    @MyAnnotation05(address = "seoul", age = 20)
    public void method2() {

    }

    @MyAnnotation05(age = 5)
    public void method3() {

    }

    @MyAnnotation06(name = {"trump", "john"})
    public void method4() {
    }

    @MyAnnotation06(name = "trump")
    public void method5() {
    }

    @MyAnnotation07(value = "hello")
    public void method6() {
    }

    // value만 존재할 때 속성명 이름 생략 가능
    @MyAnnotation07("hello")
    public void method7() {
    }
}



