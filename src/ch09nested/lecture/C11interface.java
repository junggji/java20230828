package ch09nested.lecture;

public class C11interface {
    public static void main(String[] args) {
//        MyInterface11 o1 = new MyInterface11()
        MyInterface11 o2 = new MyClass111();
        MyInterface11 o3 = new MyInterface11() {
            @Override           // 익명클래스도 추상메소드는 꼭 재정의를 해야한다.
            public void method1() {
                System.out.println("C11interface.method1");
            }
        };

        o3.method1();
    }
}

class MyClass111 implements MyInterface11{
    @Override
    public void method1() {
        System.out.println("MyClass111.method1");
    }
}

interface MyInterface11 {
    void method1();
}