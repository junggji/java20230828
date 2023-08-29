package ch07extends.lecture;

public class C03extends {
    public static void main(String[] args) {
        MySubClass031 o1 = new MySubClass031();

        o1.printName();

    }
}
class MyClass03 {
    private String name;

    void printName() {
        System.out.println("name = " + name);
    }
}
class MySubClass031 extends MyClass03 {
    void setName(String name) {
        // private field 는 상속이 안된다(자식클래스에서 사용 불가)
        //        this.name = name;

    }
}