package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567", "김자바");

        //필드값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //Final 필드는 값을 변경할 수 없음
        //k1.naiton = "USA";
        //k1.ssn = "123-12-1234";

        // 바 final 필드는 값 변경 가능
        k1.name = "김자바";
        System.out.println("k1.name = " + k1.name);

        Korean k2 = new Korean("343434-3434343", "hong");
        System.out.println("k2.name = " + k2.name);
    }
}
