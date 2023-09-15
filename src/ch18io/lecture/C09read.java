package ch18io.lecture;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class C09read {
    public static void main(String[] args) {
        String file = "C:/Temp/out3.txt";                                     //  총 10byte
        try (InputStream is = new FileInputStream(file)) {
            byte[] b = new byte[3];
            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b)); // 3byte

            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b)); // 3byte
            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b)); // 3byte
            is.read(b);
            System.out.println("Arrays.toString(b) = " + Arrays.toString(b)); // 1byte만 읽었지만 이전값이 남아있으므로 주의.

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
