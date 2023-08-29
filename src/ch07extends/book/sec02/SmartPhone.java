package ch07extends.book.sec02;

public class SmartPhone extends Phone{ //ctrl 클릭 -> 해당 클래스로 이동, ctrl +b 뒤로 = ctrl alt 클릭
    public boolean wifi;

    public SmartPhone(String model, String color) {
        this.model= model;
        this.color = color;
    }
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }


}
