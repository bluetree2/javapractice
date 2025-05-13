package ch07.lecture.p06super;

public class App02 {
}

class Parent02 {
    // private 필드
    // 

    public Parent02() {
        // 부모 클래스 생성자가 하는 일
        // 필드 초기화
        System.out.println("부모 클래스 필드 초기화");

    }
}

class Child021 extends Parent02 {
    public Child021() {
        // 부모 클래스의 생성자 호출 코드 꼭 있어야함
        // 때문에 안쓰면 자동으로 추가됨
        super();
        // 자식 크랠스 생성자가 하는 일
        System.out.println("자식 클래스 필드 초기화");
    }

}
