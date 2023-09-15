package ch18io.lecture;

import java.io.*;

public class C21copy {
    // BufferedInputStream
    // BufferedOutputStream
    // 그림 파일 복사하는 코드
    public static void main(String[] args) {
        String src = "C:/Temp/ttest.jpg";
        String des = "C:/Temp/ttest2.jpg";

        try (InputStream is = new FileInputStream(src);
             OutputStream os = new FileOutputStream(des);
             BufferedOutputStream os2 = new BufferedOutputStream(os);
            BufferedInputStream is2 = new BufferedInputStream(is))
        {
            byte[] array = new byte[1024];
            int len = 0;
            long start = System.currentTimeMillis();
            while ((len = is2.read(array))!=-1) {
                os2.write(array, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println("걸린시간 : " + (start-end));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (InputStream is = new FileInputStream(src);
             OutputStream os = new FileOutputStream(des))
        {
            byte[] array = new byte[1024];
            int len = 0;
            long start2 = System.currentTimeMillis();
            while ((len = is.read(array))!=-1) {
                os.write(array, 0, len);
            }
            long end2 = System.currentTimeMillis();
            System.out.println("걸린시간 : " + (start2-end2));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
