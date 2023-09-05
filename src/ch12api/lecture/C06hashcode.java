package ch12api.lecture;

public class C06hashcode {
    public static void main(String[] args) {
        String o1 = new String("java");
        String o2 = new String("spring");
        String o3 = new String("java");

        System.out.println(o1 == o2); // false
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println(o1 == o3); // false
        System.out.println(o1.hashCode());
        System.out.println(o3.hashCode());      // hashcode는 문자열을 변환하는것이므로, o1 03 hashcode둘은 같다



    }
}
