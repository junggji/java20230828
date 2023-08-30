package ch07extends.book.sec10.exam02;

public class Computer extends Machine {
    @Override
    public void work() {
        System.out.println("메소드 재정의");
    }
}
