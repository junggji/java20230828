package ch19network.lecture;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class C10client {
    public static void main(String[] args) {
        try {

            Socket socket = new Socket("172.30.1.81", 7000);

            OutputStream outputStream = socket.getOutputStream();   // socket이 열리면 output
            OutputStreamWriter writer = new OutputStreamWriter(outputStream); // 문자로 입력할거라서 변환
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            Scanner scanner = new Scanner(System.in);

            try (scanner; bufferedWriter; writer; outputStream; socket) {

                while (true) {
                    System.out.print("입력>");
                    String chat = scanner.nextLine(); // 입력
                    bufferedWriter.write(chat);
                    bufferedWriter.newLine(); // 출력
                    bufferedWriter.flush();

                    if (chat.equals("bye")) {   // break해서 무한루프 없애기
                        break;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}