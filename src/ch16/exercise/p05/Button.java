package ch16.exercise.p05;

public class Button {
    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        this.clickListener.onClick();
    }

    // 정적 멤버 인터페이스(함수형 인터페이스)
    @FunctionalInterface
    public interface ClickListener {
        void onClick();
    }
}
