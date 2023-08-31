package ch08interface.lecture;

public class C07return {
    public static void main(String[] args) {
        CharSequence charSequence = getCharsequence();

        System.out.println(charSequence);
    }

    public static CharSequence getCharsequence() {
        double d = Math.random();

        if (d < 0.33) {
            return new String("java"); // String은 Charsequence이므로
        } else if (d < 0.66) {
            return new StringBuffer("spring");
        } else {
            return new StringBuilder("react");
        }

    }

}
