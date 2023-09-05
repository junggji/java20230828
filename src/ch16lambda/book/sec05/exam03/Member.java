package ch16lambda.book.sec05.exam03;

public class Member {
    private String id;
    private String name;

    public Member(String id){
        this.id=id;
        System.out.println("Member(String id)");
    }

    public Member(String id, String name){
        this.id=id;
        this.name=name;
        System.out.println("Member(String id, String name)");
    }

    public String toString() {      // 만든 인스턴드들을 설명하는 메소드생성해주는 toString
        String info = "{ id: " + id + ", name : "+name + "}";
        return info;
    }

}
