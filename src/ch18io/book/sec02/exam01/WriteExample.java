package ch18io.book.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try (OutputStream os = new FileOutputStream("C:/Temp/test1.db")) {

            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush(); // buffer해놓은 것들을 flush를 통해 보내준다.

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
