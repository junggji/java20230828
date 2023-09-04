package ch16lambda.book.sec04;

public class LambdsExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((x, y)->{
            double result = x+y;        // calc 메소드의 몸통
            return result;
        });

        person.action((x, y) -> (x+y));     // 위의 메소드를 줄인것, return = x+y 로 한줄로

        person.action((x, y) -> sum(x, y));
    }

    public static double sum(double x, double y) {
        return (x+y);
    }
}
