package ch06class;

public class C10capsule {
    public static void main(String[] args) {

    }
}
class MyClass10{
    // 별다른 이유가 없다면
    // 필드는 private으로
    // 관련된 메소드(주로 getter, setter)를 public 으로 작성

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
