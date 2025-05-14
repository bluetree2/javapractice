package ch08.sec06;

public class Audio implements RemoteControl {
    // 필드
    private int volume;
    // 필드
    private int memoryVolume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > ch08.sec04.RemoteControl.MaxVolume) {
            this.volume = ch08.sec04.RemoteControl.MaxVolume;
        } else if (volume < ch08.sec04.RemoteControl.MinVolume) {
            this.volume = RemoteControl.MinVolume;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }

    //디폴트 메소드 재정의
    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다.");
            setVolume(RemoteControl.MinVolume);
        } else {
            System.out.println("무음 해제합니다.");
            setVolume(this.memoryVolume);
        }
    }
}
