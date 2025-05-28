package ch12.sec11.exam02;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        Class<?> clazz = Car.class;
        System.out.println("[생성자 정보]");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "(");
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            printParameters(parameterTypes);
            System.out.println();
        }
        System.out.println();

        System.out.println("[필드 정보]");
        Field[] fillds = clazz.getDeclaredFields();
        for (Field field : fillds) {
            System.out.println(field.getName() + "" + field.getType());
        }
        System.out.println();

        System.out.println("[메소드 정보]");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "(");
            Class<?>[] parameters = method.getParameterTypes();
            printParameters(parameters);
            System.out.println();
        }

    }

    private static void printParameters(Class[] parameters) {
        for (int i = 0; i < parameters.length; i++) {
            System.out.print(parameters[i].getSimpleName());
            if (i < parameters.length - 1) {
                System.out.println(",");
            }
        }
    }
}
