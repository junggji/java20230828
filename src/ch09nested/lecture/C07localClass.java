package ch09nested.lecture;

public class C07localClass {
    void method() {
        // 로컬 클래스에서 사용되는 가싸고 있는 메소드의 지역변수는
        // 값을 변경할 수 없음 (final, effectively final 묵시적,사실상)
        int value = 0;
//        value= 1;
        class LocalClass {
            void method1() {
                System.out.println(value);
            }
            void method2(int param) {

            }
        }
    }
}
