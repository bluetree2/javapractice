package ch06.sec11.exam01;

public class Korean {
    // 인스턴스 fianl 필드 선언
    final String nation = "대한민국";
    final String ssn;

    // 인스턴스 빌드 선언
    String name;

    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
