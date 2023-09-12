package ch17stream.lecture;

import java.util.List;

public class C11sorted {
    public static void main(String[] args) {
        var list = List.of(10,35,1,8,5,7,9);

        System.out.println("가장 큰 수 출력");
        list.stream()
                .sorted((x, y) -> y - x) // 내림차순
                .limit(1)
                .forEach(System.out::println);

        System.out.println("가장 작은 수 출력");
        list.stream()
                .sorted() // 오름차순
                .limit(1)
                .forEach(System.out::println);



    }
}
