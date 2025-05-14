package ch08.sec04;

public interface RemoteControl {
    // 상수 빌드
    int MaxVolume = 10;
    int MinVolume = 0;

    // 추상 메소드
    void turnOn();

    void turnOff();

    void setVolume(int volume);
}
