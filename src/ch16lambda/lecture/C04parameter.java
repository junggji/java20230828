package ch16lambda.lecture;

import java.util.List;

public class C04parameter {
    public static void main(String[] args) {
        MyInterface04 o1 = (int x) -> {};
        MyInterface04 o2 = (x) -> {};
        MyInterface04 o3 = x -> {}; //  파라미터가 1개면 ()생략 가능

    }
}

interface MyInterface04 {
    void method(int x);
}