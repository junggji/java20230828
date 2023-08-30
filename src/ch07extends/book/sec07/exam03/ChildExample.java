package ch07extends.book.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();        // 타입이 Parent

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

//        parent.field2 = "data2";    // (불가능)
//        parent.method3();           // 불가능 --> Child에서만 있는 메소드 이므로

        Child child = (Child)parent;
        child.field2 = "data2";         //가능
        child.method3();                //가능
    }
}
