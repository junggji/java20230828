package ch11exception.lecture;

public class C10catch {
    public static void main(String[] args) {
        try {
            // exception 발생 가능 코드
        } catch (ArrayIndexOutOfBoundsException e) {
            // exception 처리 코드
        } catch (NumberFormatException e) {
            // exception 처리 코드
        }


        try {

        }   catch (NullPointerException | ClassCastException e) {
            // exception 처리 코드
        }
    }
}
