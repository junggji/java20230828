package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C04foreach {
    public static void main(String[] args) {
        List<MyClass04> list = new ArrayList<>();
        list.add(new MyClass04("흥민"));
        list.add(new MyClass04("강인"));
        list.add(new MyClass04("민재"));

        list.forEach(System.out::println);
        list.forEach(x -> System.out.println(x));
        list.forEach(x -> System.out.println(x.toString()));    // 위에 코드와 같기 때문에 toString 재정의 해야만 나온다.

    }
}

class MyClass04 {
    private String name;

    public MyClass04(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}