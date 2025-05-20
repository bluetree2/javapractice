package ch15.lecture.p04stack;

import java.util.Stack;

public class App01 {
    public static void main(String[] args) {
        // stack(LIFO, last in first out)
        // 마지막에 들어간 객체가 먼저 나온다.

        Stack<String> stack = new Stack<>();

        // push : 추가
        stack.push("Java");
        stack.push("Spring");
        stack.push("react");
        stack.push("CSS");
        stack.push("Java");
        System.out.println(stack);

        // pop : 꺼내기
        String e1 = stack.pop();
        System.out.println("e1 = " + e1);
        String e2 = stack.pop();
        System.out.println("e2 = " + e2);
        System.out.println(stack);

        // peek : 가장 위에 있는 객체
        String e3 = stack.peek();
        System.out.println("e3 = " + e3);


    }
}
