package ch08interface.book.sec02.exer1.exer6;

public class SoundableExample {
    public static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }


    public static void main(String[] args) {
        printSound(new Cat());      //cat은 Soundable --> 추상클래스 Soundable받는다는 힌트
        printSound(new Dog());
    }
}
