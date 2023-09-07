package ch13generic.book.exercise.p03;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<>();
        container1.setKey("홍길동", "도적");
        String name1 = container1.getField2();
        String job = container1.getKey();
        System.out.println(name1+job);

        Container<String, Integer> container2 = new Container<String, Integer>();
        container2.setField2("홍길동", 35);
        String name2 = container2.getKey();
        int age = container2.getField2();
        System.out.println(name2 +age);
    }
}
class Container <T, U> {
    private T key;

    private U field2;

    public T getKey() {
        return key;
    }

    public void setKey(U field2, T key) {
        this.field2 = field2;
        this.key =key;
    }

    public U getField2() {
        return field2;
    }

    public void setField2(T key ,U field2) {
        this.key = key;
        this.field2 = field2;
    }
}
