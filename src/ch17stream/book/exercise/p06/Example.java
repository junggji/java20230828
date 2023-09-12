package ch17stream.book.exercise.p06;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        //
        System.out.println("나이들만 출력");
        list.stream()
                .map(x-> x.getAge())
                .forEach(System.out::println);

        //
        System.out.println("나이들의 합 구해서 출력");
        Integer reduce = list.stream()
                .map(x -> x.getAge())
                .reduce(0, (x, y) -> x + y);

        System.out.println("reduce = " + reduce);

        //
        System.out.println("가장 많은 나이 reduce로 구해서 출력");
        Integer reduce1 = list.stream()
                .map(x -> x.getAge())
                .reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(reduce1);

        //
        System.out.println("가장 작은 나이 reduce로 구해서 출력");
        Integer reduce2 = list.stream()
                .map(x -> x.getAge())
                .reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(reduce2);
    }
}
