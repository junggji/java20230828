package ch17stream.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C22collect {
    public static void main(String[] args) {
        // collect -> Collectors를 통해서 사용
        //  -> stream에 있는 값들을 List, Set, Map으로 모아준다(변환해준다?)



        List<String> list = List.of("java", "spring", "css", "html");

        List<Integer> res1 = new ArrayList<>();
        for (String str : list) {
            res1.add(str.length());
        }
        System.out.println("res1 = " + res1);


        List<Integer> res2 = list.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("res2 = " + res2);

        Set<Integer> res3 = list.stream()
                .map(String::length)
                .collect(Collectors.toSet());

        System.out.println("res3 = " + res3);

        Map<String, Integer> collect = list.stream()
                .collect(Collectors.toMap(x -> x, String::length));   // x->x 라면(입출력값이 그대로라면, Function.identity()로 사용가능 44줄

        System.out.println("collect = " + collect);

        Map<String, Integer> collect1 = list.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println("collect1 = " + collect1);


    }
}
