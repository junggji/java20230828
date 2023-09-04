package ch09nested.book.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btn0k = new Button();

        class OkListner implements Button.ClickListner {
            @Override
            public void onclick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        btn0k.setClickListner(new OkListner());

        btn0k.click();

        Button btnCancel = new Button();

        class CancelListner implements Button.ClickListner {
            @Override
            public void onclick() {
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }

        btnCancel.setClickListner(new CancelListner());

        btnCancel.click();

    }
}
