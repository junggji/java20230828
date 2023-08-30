package ch07extends.lecture;

public class C23constructor {
    public static void main(String[] args) {
        MySubClass231 o1 = new MySubClass231();   // --> 자동삽인된 코드들 덕분에 사용가능한 것
    }
}

class MyClass23 {
//    MyClass23(){       ---> 생략된 코드들(자동삽입)
//
//    }

}

class MySubClass231 extends MyClass23 {
//    MySubClass231(){     ---> 생략된 코드들(자동삽입)
//        super();
//    }
}