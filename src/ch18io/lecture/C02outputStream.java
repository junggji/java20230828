package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02outputStream {
    public static void main(String[] args) {
        // OutputStream : 바이트단위 출력 스트림
        try {
            OutputStream os = new FileOutputStream("out.txt");
            os.write(70); // 4byte중 1byte만 사용(3byte는 떨어져나간다)
            os.write(71);
            os.write(73);

            os.close(); // stream이 열리면 꼭 닫아줘야 한다. --> ex.파일 사용중 삭제,이동 못하는 것과 같은경우

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
