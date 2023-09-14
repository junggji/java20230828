package ch11exception.lecture;

public class C17checked {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.Sting");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
