package ch17stream.lecture;

import java.util.List;

public class C08sorted {
    public static void main(String[] args) {
        var list = List.of(3,1,3,4,5,10,11,0); // type유추 가능해서 var로 입력
        list.stream()
                .sorted() // 오름차순 정렬 (중간연산)
                .forEach(System.out::println);

    }
}
