package ch07extends.book.sec10.exam01;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnoff();

        Phone phone = smartPhone;
        phone.turnOn();
        phone.turnoff();
//        phone.internetSearch(); // 불가능 --> 자식클래스만의 메소드
    }
}
