package ch13generic.lecture;

public class C02generic {
    public static void main(String[] args) {
        MyClass02<Object> o1 = new MyClass02<Object>();
        MyClass02<String> o2 = new MyClass02<String>();
        MyClass02<Integer> o3 = new MyClass02<Integer>();
        MyClass02<Boolean> o4 = new MyClass02<Boolean>();
//        MyClass02<int> o5 = new MyClass02<int>();  -->  기본형은 안된다 ---> wrapper클래스 사용~

        MyClass02<Object> o6 = new MyClass02<>(); // -->  뒤에 타입과 같으면 생략가능

    }
}


// generic type(일반적인 타입)
// <T> ----> type parameter  --> 참조타입만 가능
class MyClass02<T> {
    private T a;

}
