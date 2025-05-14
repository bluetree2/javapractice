package ch08.sec06;

public interface RemoteControl {
    // 상수 빌드
    int MaxVolume = 10;
    int MinVolume = 0;

    static void ChangeBattery() {
        System.out.println("리모컨 건전지를 교환합니다.");
    }

    // 추상 메소드
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
            // 추상 메소드 호출하면서 상수 필드 사용
            setVolume(MinVolume);
        } else {
            System.out.println("무음 해제합니다.");
        }

    }
}
