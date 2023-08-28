package ch06class;

import java.util.Arrays;

public class example {


    public static int[] solution(int start, int end_num) { // int[] -> 배열을 리턴
        int leng = (start-end_num+1);
        int[] answer = new int[leng];       // 배열의 길이를 정해야한다!!!

        for(int i=0; i<leng; i++) {
            answer[i] = start--;
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println((Arrays.toString(solution(10, 3))));


    }
    }

