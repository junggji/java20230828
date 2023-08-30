package ch07extends.book.sec05.exam02;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }
//
//    @Override
//    public void stop() {                  ----> stop은 final 메소드라서 override 불가
//        System.out.println("스포츠카를 멈춤");
//        speed = 0;
//    }
}
