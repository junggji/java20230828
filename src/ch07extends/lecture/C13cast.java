package ch07extends.lecture;

public class C13cast {
    public static void main(String[] args) {
        Animal13 ani1 = new Dog13();
        Animal13 ani2 = new Cat13();

        ani1.breath();
        ani2.breath();

//        ani1.sniff(); // 안됨

        // type casting (강제 형 변환) --> 자식클래스만의 메소드를 실행시킬때 사용 ---- 매우 위험!!
        Dog13 d1 = (Dog13) ani1;
        d1.sniff(); // ok

        Cat13 c1 = (Cat13)ani2;
        c1.hunt(); // ok

    }
}

class Animal13 {
    public void breath() {
        System.out.println("숨쉬다");
    }

}
class Dog13 extends Animal13 {
    public void sniff() {
        System.out.println("냄새 맡다.");
    }
}
class Cat13 extends Animal13 {
    public void hunt() {
        System.out.println("쥐를 잡다");
    }

}