package ch16lambda.lecture;

public class C11constructorReference {
    public static void main(String[] args) {
        MyInterface111 o1 = z -> new MyClass11(z);
        MyInterface111 o2 = MyClass11::new;     // 생성자와 메소드 파라미터 같음 (int타입 1개)

        MyInterface112 o3 = (a, b) -> new MyClass11(a, b);
        MyInterface112 o4 = MyClass11::new;

    }
}

class MyClass11 {
    MyClass11(int a){}
    MyClass11(String a, int b) {}

}

@FunctionalInterface
interface MyInterface111 {
    MyClass11 method(int x);
}

@FunctionalInterface
interface MyInterface112 {
    MyClass11 method(String x, int y);
}


