package ch12api.lecture;

public class C11string {
    public static void main(String[] args) {
        // String : 문자열
        String a = "java";
        String b = "java";
        String c = new String("java");  // String은 너무자주써서 생략가능 (위에처럼)

        System.out.println(a==b); // true
        System.out.println(a==c); // false

        System.out.println(a.equals(b)); // true
        System.out.println(a.equals(c)); // true

    }
}
