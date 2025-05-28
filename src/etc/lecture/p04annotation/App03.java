package etc.lecture.p04annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({
        ElementType.CONSTRUCTOR,
        ElementType.FIELD,
        ElementType.METHOD,
        ElementType.PARAMETER,
        ElementType.TYPE,
        ElementType.LOCAL_VARIABLE
})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {

}

@MyAnnotation03
public class App03 {
    @MyAnnotation03
    private int val;

    @MyAnnotation03
    App03() {
    }

    @MyAnnotation03
    public void method(@MyAnnotation03 int param) {
        @MyAnnotation03
        int value;
    }
}
