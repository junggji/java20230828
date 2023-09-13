package ch17stream.lecture;

import java.util.stream.IntStream;

public class C19intStream {
    public static void main(String[] args) {
        IntStream.of(9,10,0,1,3,22,77,33);

        // 최댓값 구하기
        int max = IntStream.of(9, 10, 0, 1, 3, 22, 77, 33)
                .max().orElse(0);

        System.out.println("max = " + max);

        // 최솟값 구하기
        int min = IntStream.of(9, 10, 0, 1, 3, 22, 77, 33)
                .min().orElse(0);
        System.out.println("min = " + min);

        // 평균 구하기
        double average = IntStream.of(9, 10, 0, 1, 3, 22, 77, 33)
                .average().orElse(0);

        System.out.println("average = " + average);

    }
}
