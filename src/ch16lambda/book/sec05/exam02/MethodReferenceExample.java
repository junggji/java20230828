package ch16lambda.book.sec05.exam02;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.ordering(String::compareToIgnoreCase);     // 대소문자 구분없이 사전순으로  // String은 Comparable 인자에 맞춰쓴것
    }
}
