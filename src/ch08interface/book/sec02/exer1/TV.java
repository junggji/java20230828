package ch08interface.book.sec02.exer1;

public class TV implements Remocon {
    @Override
    public void powerOn() {
        System.out.println("TV를 켰습니다.");
    }

    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }
}
