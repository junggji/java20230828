package ch12api.lecture;

public class C13substring {
    public static void main(String[] args) {
        // substring : 부분 문자열 추출
        String a = "spring";

        String sub1 = a.substring(0,2);   // ctrl+Q -> 설명나오게 하기
        System.out.println(sub1);

        char b = a.charAt(2);   // 문자 뽑아내기
        System.out.println(b);
        String[] e = a.split("");

    }
}
