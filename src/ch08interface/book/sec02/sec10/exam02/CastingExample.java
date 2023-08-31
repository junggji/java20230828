package ch08interface.book.sec02.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
//        vehicle.checkFare(); // XX

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();


    }
}
