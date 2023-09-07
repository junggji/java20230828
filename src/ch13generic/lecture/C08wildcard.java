package ch13generic.lecture;

public class C08wildcard {
    public static void main(String[] args) {
        MyClass08<?> o1 = new MyClass08<Animal>();
        MyClass08<?> o2 = new MyClass08<Dog>();
        MyClass08<?> o3 = new MyClass08<Cat>();
        MyClass08<?> o4 = new MyClass08<Object>();
        // <?> 는 결국 Object의 메소드들을 쓰기 위함이다.

        o1.equals(null);
        o2.toString();
        o3.hashCode();

    }
    public void someMethod(MyClass08<?> param) {
        param.hashCode();
        param.equals(null);
        param.toString();
    }
}

class MyClass08<T> {

}