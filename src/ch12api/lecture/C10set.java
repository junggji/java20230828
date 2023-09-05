package ch12api.lecture;

import java.util.HashSet;

public class C10set {
    public static void main(String[] args) {
        // set : 집합
        HashSet set = new HashSet();
        set.add(new Object());
        set.add(new Object());

        System.out.println(set.size());

        set.add(new String("java"));

        System.out.println(set.size());

        set.add(new String("java"));    //  14줄과 중복이라 숫자 +가 안됨

        System.out.println(set.size());
    }
}
