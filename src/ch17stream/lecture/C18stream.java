package ch17stream.lecture;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C18stream {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,1,3,9,10,11);
        Optional<Integer> reduce = list.stream()
                .reduce(Integer::sum);

        System.out.println("reduce.orElse(0) = " + reduce.orElse(0));

        OptionalInt reduce1 = IntStream.of(3, 1, 3, 9, 10, 11)
                .reduce(Integer::sum);

        System.out.println("reduce1.orElse(0) = " + reduce1.orElse(0));

        int sum1 = IntStream.of(3, 1, 3, 9, 10, 11)
                .sum(); // 자주쓰는 연산들을 함수들로 만들어놓았다. -> api보고 활용

        System.out.println("sum1 = " + sum1);

    }
}
