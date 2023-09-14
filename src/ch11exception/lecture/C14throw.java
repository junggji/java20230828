package ch11exception.lecture;

public class C14throw {
    public static void main(String[] args) {
        System.out.println("main code1");
        try {
            method3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main code2");

    }

    private static void method3() throws Exception { //// checked Exception 이면 명시해줘야한다.
        throw new Exception();
    }
}
