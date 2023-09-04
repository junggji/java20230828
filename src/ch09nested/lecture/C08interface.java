package ch09nested.lecture;

public class C08interface {
    public static void main(String[] args) {
        class ConcreteClass implements MyClass08.NestedInterface{
            @Override
            public void method2() {
                System.out.println("ConcreteClass.method2");
            }
        }
        ConcreteClass c = new ConcreteClass();
        c.method2();
    }
}

class MyClass081 implements MyClass08.NestedInterface {
    @Override
    public void method2() {
        System.out.println("MyClass081.method2");
    }
}

class MyClass08 {
    interface NestedInterface {  // 대부분 클래스 내부에서 사용하는 인터페이스, 다른 클래스에서도 사용가능
        // 생략해도 public static이라 다른클래스에서 바로 사용가능
        // public final static field
        // public abstract instance method (*******)
        void method2();
        // private instance method
        // default instance method
        // public static method
        // private static method
    }

    void method() {
        class ConcreteClass implements NestedInterface {
            @Override
            public void method2() {
                System.out.println("ConcreteClass.method2");
            }
        }
        ConcreteClass c = new ConcreteClass();
        c.method2();

    }
}