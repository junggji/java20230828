package ch11exception.lecture;

public class C05printStackTrace {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int i = 0;
            int j = 3 / i;
            System.out.println("code2");
        } catch (ArithmeticException e) {
            // 코드 오류메시지를 띄워준다. -> 쓰는게 코드 수정에 도움이 된다!
            e.printStackTrace();
        }

        System.out.println("code3");

    }
}
