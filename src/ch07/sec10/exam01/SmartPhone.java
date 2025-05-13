package ch07.sec10.exam01;

public class SmartPhone extends Phone {
    // 자식 생성자 선언
    public SmartPhone(String model, String color) {
        super();
        this.setModel(model);
        this.setColor(color);
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
