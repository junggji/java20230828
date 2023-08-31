package ch07extends.lecture;

public class MyClass30 {
    private void privateMethod() {
        System.out.println("MyClass30.privateMethod");
    }

    public void publicMethod() {
        System.out.println("MyClass30.publicMethod");

        // private 멤버(field, method, +생성자) 접근 가능
        privateMethod();
    }

    void packagePrivateMethod() {  // package private 메소드가 생략된것
        System.out.println("MyClass30.packagePrivateMethod");
        privateMethod();
        protectedMethod();
    }

    protected void protectedMethod() {
        System.out.println("MyClass30.protectedMethod");

        privateMethod();
        packagePrivateMethod();
        publicMethod();
    }
}
