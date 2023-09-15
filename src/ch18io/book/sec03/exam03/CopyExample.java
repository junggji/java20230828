package ch18io.book.sec03.exam03;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "C:/Temp/test.png";
        String targetFileName = "C:/Temp/test2.png";

        try (InputStream is = new FileInputStream(originalFileName);
        OutputStream os = new FileOutputStream(targetFileName)){

            byte[] data = new byte[1024];
            while(true) {
                int num = is.read(data);

                if (num == -1) break;
                os.write(data, 0, num);
            }

            os.flush();

            System.out.println("복사가 잘 되었습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
