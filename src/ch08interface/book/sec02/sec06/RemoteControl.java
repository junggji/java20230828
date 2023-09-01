package ch08interface.book.sec02.sec06;

public interface RemoteControl{
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {

    }
    static void changeBattery() {
        System.out.println("리모콘 건전지를 교체합니다.");
    }
}
