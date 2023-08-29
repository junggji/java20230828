package ch07extends.book.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child; // 변수의 타입 Parent

        parent.method1();
        parent.method2();
//        parent.method3();
    }
}
