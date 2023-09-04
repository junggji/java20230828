package ch16lambda.book.exercise.p05;

public class Button {
    @FunctionalInterface
    public static interface ClickListner {
        void onClick();
    }
    private ClickListner clickListner;

    public void setClickListner(ClickListner clickListner) {
        this.clickListner = clickListner;
    }

    public void click() {
        this.clickListner.onClick();
    }


}
