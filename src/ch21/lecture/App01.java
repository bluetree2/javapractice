package ch21.lecture;

import java.util.ArrayList;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        int a;
        a = 3;
        int b = 5;

        //var : 변수의 타입이 추론 가능할 때
        var c = 7;
        var d = 7L;
        var f = "java";

        List<Integer> list = List.of(1, 2, 3);
        var list2 = List.of(1, 2, 3);

        ArrayList<String> list3 = new ArrayList<>();
        var list4 = new ArrayList<String>();

    }
}
