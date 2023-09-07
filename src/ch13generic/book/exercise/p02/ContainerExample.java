package ch13generic.book.exercise.p02;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.setA("홍길동");
        String str = container1.getA();
        System.out.println(str);


        Container<Integer> container2 = new Container<>();
        container2.setA(6);
        int value = container2.getA();
        System.out.println(value);
    }
}

class Container<T>  {

    private T a;

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
}