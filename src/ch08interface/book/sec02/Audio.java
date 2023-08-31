package ch08interface.book.sec02;

public class Audio implements  RemoteControl {

    @Override
    public void turn0N() {
        System.out.println("Audio를 켭니다.");
    }
}
