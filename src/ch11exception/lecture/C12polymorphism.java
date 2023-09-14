package ch11exception.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        try {
            // ClassCastException
            // NullPointerException
            // ArithmeticException
        } catch (ClassCastException e) {
            // ClassCastException  ---> 위에 RuntimeException에서 잡혀서 실행불가! ==> Runtime보다 순서를 앞에 작성하면 해결
            // 예외처리
        } catch (RuntimeException e) {
            // NullPointerException
            // ArithmeticException
            // 예외처리
        }
    }
}
