package ch11exception.lecture;

public class C07finally {
    public static void main(String[] args) {
        System.out.println("code1");

        try{
            int j = 3/0;
            System.out.println("code2");
            return;
        } catch (ArithmeticException e) {
            System.out.println("code3");
        } finally {
            System.out.println("code4");    // --> return이 되어도 finally코드는 실행된다.
        }
        System.out.println("code5"); // -> return이 되면 실행되지 않는코드.



    }
}
