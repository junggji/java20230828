package ch07extends.lecture;

public class C02extends {
    public static void main(String[] args) {
        MysubClass021 o1 = new MysubClass021();
        o1.name = "spring";
        o1.method3();
    }
}

class MysubClass021 extends MyClass02 {

}

class MyClass02 {
    String name;

    void method3() {
        System.out.println(name);
    }
}

// MyClass02 : 상위 클래스, 부모 클래스, super class
// MysubClass021 : 하위클래스, 자식클래스, sub class







