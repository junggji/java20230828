package ch11exception.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        try {

        } catch (NullPointerException e) {
            // 동일한 예외처리코드
        } catch (ArithmeticException e) {
            // 동일한 예외처리코드
        }

        try {
            // NullPointerException 이 나오던
            // ArithmeticException 이 나오던 상위타입인 RuntimeException으로 잡을 수 있다!! (다형성)
        } catch (RuntimeException e) {
            // 여러 exception 의 상위 타입으로 한번에 잡을 수 있음
            // 가장 상위타입인 Object는 안되고, 그 바로 아래타입인 Throwable 까지만 가능하다.
            // 동일한 예외처리코드
        }
    }
}
