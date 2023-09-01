package ch08interface.book.sec02.exer1.exer8;

public class Example {
    public static void action(A a) {
        a.method1();
        if(a instanceof C c) {
            c.method2();
        }
    }

    public static void main(String[] args) {
        action(new B());  // B와 C를 인자로 받을려면, B와 C의 상위타입을 써야한다는 힌트를 얻을 수 있다.!!
        action(new C());
    }
}
