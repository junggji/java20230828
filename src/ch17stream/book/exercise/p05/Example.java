package ch17stream.book.exercise.p05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lambda Expression",
                "Java8 supports lambda expressions"
        );

        System.out.println("고전적인 for 사용");
        for(String item : list) {
            if(item.toLowerCase().matches(".*java.*")) {
                System.out.println(item);
            }
        }

        System.out.println("stream 사용");
        list.stream()
                .filter(e -> e.toLowerCase().matches(".*java.*"))
                .forEach(System.out::println);

        System.out.println("contain 사용");
        list.stream()
                .filter(e -> e.toLowerCase().contains("java"))
                .forEach(System.out::println);

        System.out.println("indexOf 사용");
        list.stream()
                .filter(s-> s.toUpperCase().indexOf("JAVA") != -1) // indexof -> 찾지못하면 -1 return
                .forEach(System.out::println);


    }
}
