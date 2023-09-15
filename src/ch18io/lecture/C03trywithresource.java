package ch18io.lecture;

import java.io.*;
import java.util.Scanner;

public class C03trywithresource {
    public void method1() {
        OutputStream os = null; // finally에서도 써야 하기때문에 try밖에서 선언
        try {
            os = new FileOutputStream("");
            os.write(110);
            os.write(111);
            os.write(112);

            os.close(); // io stream을 꼭 닫아야함
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method2() {

        // try-with-resources 문법
        // 변수의 타입은 AutoCloseable이어야 한다.
        try (OutputStream os = new FileOutputStream("");) {

            os.write(33);
            os.write(67);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void method3() {
        try (
                FileOutputStream fos = new FileOutputStream("");
                FileInputStream fis = new FileInputStream("");
        ) {
            fos.write(234);
            fis.read();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method4() {
        Scanner scanner = new Scanner(""); // 값이 한번만 할당할때 가능한 방법 (effectively final)
        try (scanner) {
            scanner.hasNext();
            scanner.next();
        }
    }

    public void method5() {
        try {
            FileInputStream fio = new FileInputStream("");
            FileOutputStream fos = new FileOutputStream("");

            try (fio;fos) {

                fio.read();
                fos.write(33);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void method6() throws Exception {
        // 안좋은 코드임... 오류났을때 바로 호출메소드로 이동하기때문...---> 91,92실행 못함

        FileOutputStream fos = new FileOutputStream("");
        FileInputStream fis = new FileInputStream("");

        fos.write(33);
        fis.read();

        fos.close(); // 꼭 실행되어야 하는 태그 인데 위에서 exception발생하면 실행되지 못한다.
        fis.close();
    }


}
