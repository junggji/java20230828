package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class C15reader {
    public static void main(String[] args) {
        // 문자 단위 입력 스트림
        String path = "C:/Temp/out7.txt";
        try (Reader reader = new FileReader(path)) {
            int read = reader.read();// 첫번째 문자열
            char c1 = (char) read;
            int read1 = reader.read();// 두번째 문자열
            int read2 = reader.read();// 세번째 문자열

            System.out.println("read = " + read);   // 손 unicode
            System.out.println("read1 = " + read1); // 흥 unicode
            System.out.println("read2 = " + read2); // 민 unicode

            System.out.println("c1 = " + c1);
            System.out.println("(char)read1 = " + (char)read1);
            System.out.println("(char)read2 = " + (char)read2);

            char[] chars = new char[3];
            int read3 = reader.read(chars);
            System.out.println(Arrays.toString(chars));
            int read4 = reader.read(chars);
            System.out.println(Arrays.toString(chars));
            int read5 = reader.read(chars);
            System.out.println(Arrays.toString(chars));

            System.out.println("read3 = " + read3);
            System.out.println("read4 = " + read4);
            System.out.println("read5 = " + read5);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
