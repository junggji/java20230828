package ch09nested.book.exercise.ex05;

public class ActionExample {
    public static void main(String[] args) {
        Action action = new Action() {      // 여기서만 쓰고, 버릴 것이라서 간소화한 코드로 쓴다.
            @Override
            public void work() {
                System.out.println("복사를 합니다.");
            }
        };
        action.work();

        // lamda 16장에서 배울내용~
        Action action2 = () -> System.out.println("복사를합니다.2");
        action2.work();
    }
}
