package ch07extends.book.sec06.package2;

import ch07extends.book.sec06.package1.A;

public class D extends A {
    public D() {
        super();
    }

    public void method1(){
        this.field = "value";
        this.method();
    }

    public void method2() {
//        A a = new A();        // protected라서 상속을 통해서만 사용가능하다
//        a.field = "value";
//        a.method();
    }
}
