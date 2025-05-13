package ch07.sec10.exam01;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // SmartPhone 객체 현상
        SmartPhone phone = new SmartPhone("iPhone 11", "black");

        // Phone으로부터 상속받은 필드 읽기
        System.out.println(phone.getModel());
        System.out.println(phone.getColor());
    }
}
