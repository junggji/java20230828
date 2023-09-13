package ch17stream.book.exercise.p08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );


        Map<String, List<Member>> groupingMap = list.stream()
                        .collect(Collectors.groupingBy(Member::getJob));


        groupingMap.get("개발자").forEach(System.out::println);

        System.out.println("[개발자]");
        Map<String, String> collect = list.stream()
                .filter(s->s.getJob().equals("개발자"))
                .collect(Collectors.toMap(Member::getName, Member::getJob));

        System.out.println(collect);

        System.out.println();

        System.out.println("[디자이너]");
        Map<String, String> collect1 = list.stream()
                .filter(s -> s.getJob().equals("디자이너"))
                .collect(Collectors.toMap(Member::getName, Member::getJob));

        System.out.println(collect1);

    }
}
