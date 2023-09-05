package ch12api.lecture;

public class C14charAt {
    public static void main(String[] args) {
        // charAt : 특정 인덱스의 char를 리턴하는 메소드
        String a = "spring";
        char c = a.charAt(0); // 's'
        System.out.println(c);
        System.out.println(a.charAt(1));

        String a2 = "The";
        for (int i = 0; i < a2.length(); i++) {
            String b2 = String.valueOf(a2.charAt(i));

        }

    }
}
