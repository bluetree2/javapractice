package ch07.sec10.exam01;

public class Phone {
    // 필드 선언
    private String model;
    private String color;

    // 기본 생성자 선언
    public Phone() {
        System.out.println("Phone() 생성자 실행");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
