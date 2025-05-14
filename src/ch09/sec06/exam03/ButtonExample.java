package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        // OK버튼 객체 생성
        Button btnok = new Button();

        // Ok버튼 클릭 이벤트를 처리할 ClickListner 구현 클래스
        class OkClickListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("ok버튼을 클릭했습니다.");
            }
        }

        // Ok버튼 객체에 ClickListner 구현 객체 주입
        btnok.setClickerListener(new OkClickListener());

        // OK 버튼 클릭하기
        btnok.click();

        // cancel 버튼 객체 생성
        Button btncancel = new Button();

        // Cancel 버튼 클릭 이벤트를 처리할 Clicklistner 구현 클래스
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("cancel버튼을 클릭했습니다.");
            }
        }

        // Cancel 버튼 객체에 ClickListner 구현 객체 주입
        btncancel.setClickerListener(new CancelListener());

        // cancel 버튼 클릭하기
        btncancel.click();

    }
}
