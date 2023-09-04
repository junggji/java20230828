package ch09nested.lecture;

public class C09anonymous {
    public static void main(String[] args) {
        MyClass09 o1 = new MySubClass091();
        o1.method1();

        // anonymous class (익명 클래스)
        // ********--- 클래스의 상속과, 인스턴스 생성을 동시에 했기때문에 자식클래스에 이름이 없는 상태 *******
        MyClass09 o2 = new MyClass09(){
            // 자식클래스 몸통 ( 몸통에는 fieid, method만 사용가능 생성자 X)
            // field
            // method

            @Override
            void method1() {
                System.out.println("C09anonymous.method1");
            }
        };
        o2.method1();

    }
}

class MyClass09 {
    void method1() {
        System.out.println("MyClass09.method1");
    }
}

class MySubClass091 extends MyClass09 {
    @Override
    void method1() {
        System.out.println("MySubClass091.method1");
    }
}