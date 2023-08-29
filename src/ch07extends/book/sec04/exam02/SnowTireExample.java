package ch07extends.book.sec04.exam02;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.run();
        tire.run();
    }
}
class Tire {
    public void run() {
        System.out.println("일반 타이어");
    }
}

class SnowTire extends Tire {
    public void run() {
        System.out.println("스노우 타이어");
    }
}