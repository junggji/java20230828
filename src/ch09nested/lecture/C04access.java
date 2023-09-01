package ch09nested.lecture;

public class C04access {
    //  static member는 instance member에 접근할 수 없다.
    // static 멤버는 클래스와 관련된 정보,

    int instanceField;

    static int staticField;

    static class StaticNestedClass {
        void method1() {
//            System.out.println(instanceField); // X -> static에서 instance는 접근할 수 없기 때문.
            System.out.println(staticField);
        }
    }

    class InnerClass {
        void method1() {
            System.out.println(instanceField);
            System.out.println(staticField);
        }
    }
}


