package ch12api.lecture;

public class C15indexOf {
    public static void main(String[] args) {
        // indexof : 특정 문자열이 시작하는 위치(index) 리턴
        String a = "spring";

        int ring = a.indexOf("ng");
        System.out.println(ring);


        String b = "spring is spring";
        int ing = b.indexOf("ring");
        System.out.println(ing);

        int index1 = b.indexOf("ring", 2);
        System.out.println(index1);

        int index2 = b.indexOf("ring", 3);
        System.out.println(index2);
    }
}
