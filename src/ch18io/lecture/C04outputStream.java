package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C04outputStream {
    public static void main(String[] args) {
        String path = "C:/Temp/out1.txt";
        try (OutputStream os = new FileOutputStream(path)) { // try-with-resources 에서 ';'은 1일때 안써도 되고, n개있을때는 마지막빼고 써야함
            os.write(70); //  4byte 중 1byte -> 1byte
            os.write(71);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료!");
    }
}
