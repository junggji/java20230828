package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C06nestedList {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();

        row1.add(9);
        row1.add(7);
        row1.add(5);

        row2.add(10);
        row2.add(20);

        list.add(row1);
        list.add(row2);

        System.out.println(list);

        list.add(row1);

        System.out.println(list);

        // 값 교체
        list.get(0).set(0, 99);
        System.out.println(list);


    }
}
