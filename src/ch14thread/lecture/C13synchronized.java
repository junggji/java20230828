package ch14thread.lecture;

public class C13synchronized {
    public static void main(String[] args) throws InterruptedException {
        MyBox box = new MyBox(0);
        Thread t1 = new Thread(new Task(box));
        t1.start();

        Thread t2 = new Thread(new Task(box));
        t2.start();

        t1.join();
        t2.join();
        System.out.println("box.getValue() = " + box.getValue());
    }
}

class Task implements Runnable {
    private MyBox box;

    public Task(MyBox box) {
        this.box = box;
    }

    @Override
    public void run() {
        for(int i =0; i<10000; i++) {
            box.increment();
        }
    }
}

class MyBox {
    private int value;


    //monitor lock
    private Object lock = new Object(); // --> 아무객체나 생성

    public MyBox(int value) {
        this.value = value;
    }


    public void increment() {
        // synchronized block
        synchronized (lock) { // 이 부분을 여러쓰레드가 동시에 접근못하도록 하는 메소드 -> 하나의 객체를 주어서 경쟁하도록(번갈아가면서 사용)
            value++;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
