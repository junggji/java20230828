package ch16lambda.lecture;

public class C06methodReference {
    public static void main(String[] args) {
        MyInterface06 o1 = a -> C06methodReference.someMethod(a);  // 단순 메소드 호출만 하는경우 아래같이 줄일 수 있다.

        // 메소드 참조 (method reference)
        MyInterface06 o2 = C06methodReference::someMethod;

    }
    public static void someMethod(int x) {

    }

}
interface MyInterface06 {
    void method(int a);
}
