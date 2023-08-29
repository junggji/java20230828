package ch07extends.lecture;

public class C10polymorphism {
    public static void main(String[] args) {
        Malamute10 dog1 = new Malamute10();
        Chihuahua10 dog2 = new Chihuahua10();

        Canidae10 can1 = dog1;  // --> = 기호는 오른쪽의 값을 왼쪽으로 할당하라는 의미(같다X) so, left>right 여야함
        Canidae10 can2 = dog2;

        Animal10 ani1 = dog1;
        Animal10 ani2 = dog2;       // 위에 모든 코드 역으로는 안된다!

        dog1.breath();
        dog2.breath();

        dog1.cry();
        can1.cry();
        ani1.cry();

        dog2.cry();
        can2.cry();
        ani2.cry();
    }
}

class Animal10{
    public void breath() {
        System.out.println("숨쉬다");
    }
    public void cry() {
        System.out.println("동물이 운다");
    }
}

class Canidae10 extends Animal10 {

}

class Malamute10 extends Canidae10 {
    @Override
    public void cry() {
        System.out.println("왕왕");
    }
}

class Chihuahua10 extends Canidae10 {
    @Override
    public void cry() {
        System.out.println("왈왈");
    }
}