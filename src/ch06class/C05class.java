package ch06class;

public class C05class {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05(); // new연산자의 결과는 참조값
        MyClass05 o2 = new MyClass05();

        System.out.println("o1의 참조값 " + System.identityHashCode(o1));
        o1.age = 30;        // o1의 age
        o1.model = "java";  // MyClass05의 model  --> 권장하지 않음
        MyClass05.model = "spring"; // ---> 권장

        System.out.println("o1.age = " + o1.age);  //30
        System.out.println("o2.age = " + o2.age);  //0
        System.out.println("o1.model = " + o1.model); // spring
        System.out.println("o2.model = " + o2.model); // spring
    }
}
class MyClass05 {
    // 속성 fields
    // instance field --> 통상 필드라고 하면, 대부분 인스턴스필드를 지칭
    int age;

    // static field, class field, 정적필드
    static String model; // --> 클래스에 관한 값


    // 기능

}