package ch08interface.book.sec02.exer1.sec08;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();

        rc.turn0N();

        rc = new Audio();
        rc.turn0N();
    }
}
