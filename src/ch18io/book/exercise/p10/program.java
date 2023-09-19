package ch18io.book.exercise.p10;

import java.io.*;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("원본 파일 경로를 입력하세요");
        String srcPath = "";
        String copyPath = "";
        srcPath = scanf.nextLine();
        System.out.println("복사 파일 경로를 입력하세요");
        copyPath = scanf.nextLine();

        File file = new File(srcPath);
        File file2 = new File(copyPath);
        try {


            if (file.exists()) {
                InputStream is = new FileInputStream(file);
                BufferedInputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(copyPath);
                BufferedOutputStream bos = new BufferedOutputStream(os);

                try (is; bis; os; bos) {

                    byte[] bytes = new byte[1024];
                    int len = 0;
                    while ((len = bis.read()) != -1) {
                        bis.read(bytes, 0, len);
                    }


                    while ((len = bis.read())!=-1) {
                        bos.write(bytes, 0, len);
                    }bos.flush();
                }
            } else {
                System.out.println("원본 파일이 존재하지 않습니다.");

            }


        } catch (Exception e) {
            e.printStackTrace();
        }


        if (!file2.exists()) {
            file2.mkdirs();
        }


    }
}
