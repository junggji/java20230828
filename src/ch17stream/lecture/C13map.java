package ch17stream.lecture;

import java.util.List;

public class C13map {
    public static void main(String[] args) {
        // map : 원래원소 받아서 다른 원소 return하고 싶을때 사용
        var list = List.of(3,1,2,5,7);
        list.stream()
                .map(x -> 10)
                .forEach(System.out::println);

        System.out.println("음수로 바꿔서 출력");
        list.stream()
                .map(x -> -x)
                .forEach(System.out::println);

        System.out.println("두배한 값으로 출력");
        list.stream()
                .map(x -> 2*x)
                .forEach(System.out::println);

        System.out.println("제곱값");
        list.stream()
                .map(x->x*x)
                .forEach(System.out::println);



    }
}
