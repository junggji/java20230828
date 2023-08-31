package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;

public class C10instanceof {
    public static void main(String[] args) {
        // instanceof
        // 연산결과 : boolean
        // 좌변 : 참조변수
        // 우변 : 타입(클래스, 인터페이스.....)

        CharSequence c = "java";

        boolean r1 = c instanceof String; // rue
        boolean r2 = c instanceof Serializable; //true
        boolean r3 = c instanceof Comparable; // true
        boolean r4 = c instanceof Constable; //true
        boolean r5 = c instanceof CharSequence; // true

    }
}
