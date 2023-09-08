package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C08set {
    public static void main(String[] args) {
        Set<String> set= new HashSet<>();

        set.add("java");
        set.add("kangin");
        set.add("min jae");

        set.forEach(System.out::println); // 순서 보장되지 않는다. -> HashSet의 특징

        System.out.println("시간이 흐른 후 ");
        set.forEach(System.out::println);

    }
}
