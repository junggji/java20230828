package ch18io.lecture;

import java.io.*;

public class C13writer {
    public static void main(String[] args) {
        // outputstream과 비교
        String file1 = "C:/Temp/out5.txt";
        String file2 = "C:/Temp/out6.txt";

        try{
            OutputStream os = new FileOutputStream(file1);
            Writer wrtier = new FileWriter(file2);

            try (os; wrtier) {
                os.write(65);
                wrtier.write(65);

                os.write(48124);
                wrtier.write(48124);

                os.flush();
                wrtier.flush();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
