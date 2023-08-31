package ch08interface.book.sec02.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);

    }

    public static void ride(Vehicle vehicle) {
        vehicle.run();
//        if(vehicle instanceof Bus) {
//            Bus bus = (Bus) vehicle;
//            bus.checkFare();
//        }

        if(vehicle instanceof Bus bus) {
            bus.checkFare();
        }

    }
}
