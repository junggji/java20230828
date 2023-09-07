package ch15collection.lecture;

import ch07extends.exercise.p12.A;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C03contains {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add(new String("java"));
        list1.add(new String("sppring"));

        boolean c1 = list1.contains(new String("java")); // String은 Object의 equals 메소드를 재정의 했기 때문에 true
        System.out.println("c1 = " + c1); // true

        List<MyClass03> list2 = new ArrayList<>();
        list2.add(new MyClass03("흥민"));
        list2.add(new MyClass03("강인"));

        boolean c2 = list2.contains(new MyClass03("흥민")); // MyClass03은 Object의 equals 메소드를 재정의 X -> false
        System.out.println(c2); // false        // equals메소드를 재정의 후에는 true 로

    }
}


class MyClass03 {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass03 myClass03 = (MyClass03) o;

        return Objects.equals(name, myClass03.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public MyClass03(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}