package ch07extends.exercise.p12.package2;

import ch07extends.exercise.p12.package1.MyClass;

public class MySubClass extends MyClass {

    @Override
    public void method1() {

    }

    @Override
    protected void method2() {

    }

    @Override
    public void method3() {         //--> 더 높은 제한자(public) 으로 변경 가능, 좁은범위 제한자로는 XXX

    }
}
