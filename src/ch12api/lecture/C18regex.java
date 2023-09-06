package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        // regular expression : 정규표현식(정규식, 정규식표현)
        // 문자열의 패턴을 나타내는 기호들

        // 문자
        System.out.println("x".matches("x")); // true
        System.out.println("a".matches("a")); // true
        System.out.println("a".matches("x")); // false

        System.out.println("xyz".matches("xyz")); // true
        System.out.println("xxx".matches("xxx")); // true
        System.out.println("xxx".matches("x")); // false

        // 수량자(quantifiers)
        System.out.println("xxx".matches("x{3}")); // true
        System.out.println("aaa".matches("a{3}")); // true
        System.out.println("aa".matches("a{3}")); // false
        System.out.println("aaa".matches("a{1,3}")); // true (1~3번까지)
        System.out.println("aa".matches("a{1,3}")); // true (1~3번까지)
        System.out.println("a".matches("a{1,3}")); // true (1~3번까지)

        System.out.println("dog".matches("do{1,3}g"));
        System.out.println("dooog".matches("do{1,3}g"));
        System.out.println("doog".matches("do{1,3}g"));

        System.out.println("dodog".matches("do{1,3}g")); // false

        // 그룹 : ()

        System.out.println("dodog".matches("(do){1,3}g")); // true

        //수량 :
        System.out.println("dog".matches("do{1,}g")); // --> 1개 이상~
        System.out.println("doog".matches("do{1,}g")); // --> 1개 이상~
        System.out.println("doooog".matches("do{1,}g")); // --> 1개 이상~
        System.out.println("dooooooog".matches("do{1,}g")); // --> 1개 이상~

        // ? : 없거나 한번
        System.out.println("dg".matches("do?g")); // true
        System.out.println("dog".matches("do?g")); // true
        System.out.println("doog".matches("do?g")); // true

        // * : 0번 이상
        System.out.println("dg".matches("do*g")); // true
        System.out.println("dog".matches("do*g")); // true
        System.out.println("doooog".matches("do*g")); // true
        System.out.println("doooooog".matches("do*g")); // true

        // + : 1번 이상
        System.out.println("dg".matches("do+g")); // false
        System.out.println("dog".matches("do+g")); // true
        System.out.println("doooog".matches("do+g")); // true
        System.out.println("doooooog".matches("do+g")); // true


        // 문자 분류 (Character classes)
        System.out.println("dog".matches("d[oi]g")); // true
        System.out.println("dig".matches("d[oi]g")); // true
        System.out.println("dag".matches("d[oi]g")); // false

        System.out.println("dog".matches("d[^oi]g")); // false --> ^ 는 아닐때
        System.out.println("dig".matches("d[^oi]g")); // false --> ^ 는 아닐때
        System.out.println("dag".matches("d[^oi]g")); // true

        System.out.println("dag".matches("d[a-z]g")); // true

        System.out.println("dag".matches("d[a-cx-z]g")); // true
        System.out.println("dbg".matches("d[a-cx-z]g")); // true
        System.out.println("dcg".matches("d[a-cx-z]g")); // true
        System.out.println("ddg".matches("d[a-cx-z]g")); // false
        System.out.println("deg".matches("d[a-cx-z]g")); // false
        System.out.println("dfg".matches("d[a-cx-z]g")); // false
        System.out.println("dxg".matches("d[a-cx-z]g")); // true
        System.out.println("dyg".matches("d[a-cx-z]g")); // true
        System.out.println("dzg".matches("d[a-cx-z]g")); // true

        // 문자 분류 기호
        System.out.println("0".matches("[0-9]")); // true
        System.out.println("7".matches("[0-9]")); // true
        System.out.println("0".matches("\\d")); // true
        System.out.println("7".matches("\\d")); // true

        System.out.println("a".matches("[a-zA-Z_0-9]")); // true
        System.out.println("_".matches("\\w")); // true
        System.out.println("8".matches("\\w")); // true

        // 예제 : 숫자로 시작하면 안되고, 영문대소문자, _, $
        String title = "[a-zA-Z_$][a-zA-Z_$0-9]*";
        System.out.println("patter_1".matches(title));
        System.out.println("$".matches(title));
        System.out.println("4".matches(title));

        // 전화번호 패턴
        // 010-1111-2222
        // 010-1111-2222
        // 010-1111-2222
        // 010-1111-2222
        // 010-1111-2222
        // 숫자 2~3로 시작

        String tel = "\\d{2,3}-?\\d{3,4}-?\\d{4}"; // --->  ? 는 있거나 없거나
        System.out.println("02-999-5834".matches(tel));
        System.out.println("010-8812-1234".matches(tel));
        System.out.println("01012345678".matches(tel));
        System.out.println("029991234".matches(tel));

        // 모든 문자 : .
        System.out.println(" ".matches("."));
        System.out.println("a".matches("."));
        System.out.println("3".matches("."));
        System.out.println("+".matches("."));

         // . : \.
        System.out.println(".".matches("\\.")); // t
        System.out.println("a".matches("\\.")); // f
        System.out.println("3".matches("\\.")); // f
        System.out.println("+".matches("\\.")); // f

        // 이메일 패턴
        // 영문소문자, 숫자가 여러개 @ 영문소문자,숫자 여러개 . 영문소문자,숫자 여러개
        String email = "[a-z0-9]+@[a-z0-9]+\\.[a-z0-9]{1,3}";
        System.out.println("dcc@naver.com".matches(email));
        System.out.println("dcc15ZZ@naver.com".matches(email));

        // or : | (pipe/or)
        System.out.println("aaefadedogfejo".matches(".*dog.*"));
        System.out.println("aaeatfcatogfejo".matches(".*cat.*"));
        System.out.println("aaeatfcatogfejo".matches(".*(dog|cat).*"));



    }
}






