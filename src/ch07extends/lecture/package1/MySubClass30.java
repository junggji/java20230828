package ch07extends.lecture.package1;

import ch07extends.lecture.MyClass30;

public class MySubClass30 extends MyClass30 {
    public void someMethod() {
        super.publicMethod();
        super.protectedMethod();
//        super.privateMethod(); // 안됨
//        super.packagePrivateMethod(); // 안됨
    }
}
