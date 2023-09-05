package ch16lambda.lecture;

public class C10constructorReference {
    public static void main(String[] args) {
        MyInterface10 o1 = () -> {
          return new MyClass10();
        };

        MyInterface10 o2 = () -> new MyClass10();

        MyInterface10 o3 = MyClass10::new;      // 위에 코드들을 줄인것 ( 양쪽 파라미터 같을때 )
    }
}

class MyClass10 {
    MyClass10() {}
}


@FunctionalInterface
interface MyInterface10 {
    MyClass10 method();     // method 리턴타입 MC10, 생성자의 파라미터와 메소드의 파라미터 같을때
}