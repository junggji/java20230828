package ch09nested.book.sec06.exam03;

public class Button {
    public static interface ClickListner {
        void onclick();
    }
    private ClickListner clickListner;

    public void setClickListner(ClickListner clickListner) {
        this.clickListner= clickListner;
    }

    public void click() {
        this.clickListner.onclick();
    }
}