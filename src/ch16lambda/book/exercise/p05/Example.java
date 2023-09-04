package ch16lambda.book.exercise.p05;

public class Example {
    public static void main(String[] args) {
        Button btn0k = new Button();
        btn0k.setClickListner(() -> System.out.println("Ok 버튼을 클릭했습니다."));
        btn0k.click();

        Button btnCancel = new Button();
        btnCancel.setClickListner(()-> System.out.println("Cancel 버튼을 클릭했습니다."));
        btnCancel.click();
    }
}
