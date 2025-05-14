package ch16.sec02.exam02;

import ch09.sec06.exam03.Button;

public class ButtonExample {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button btnOk = new Button();

        // Ok 버튼 객체에 람다식(ClickListner 익명 구현 객체) 주입
        btnOk.setClickerListener(() -> {
            System.out.println("ok 버튼을 클릭했습니다");
        });

        //OK버튼 클릭하기
        btnOk.click();

        // Cancel버튼 객체 생성
        Button btnCancel = new Button();

        // Cancel 버튼 객체에 람다식(Clicklistner)주입
        btnCancel.setClickerListener(() -> {
            System.out.println("Cancel 버튼을 클릭했습니다");
        });

        // Cancel 버튼 클릭하기
        btnCancel.click();

    }
}
