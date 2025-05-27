package ch19.lecture;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class App05Client {
    // sersver에게 file 보내기
    // 192.168.0.5

    public static void main(String[] args) {
        String fileName = "C:/Temp/bull.jpg";  // 전송할 이미지 파일 경로

        try {
            // 서버에 연결
            Socket socket = new Socket("192.168.0.29", 9876);

            // 파일 전송을 위한 스트림 생성
            OutputStream os = socket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);

            File file = new File(fileName);
            byte[] fileData = new byte[(int) file.length()];

            FileInputStream fis = new FileInputStream(file);
            fis.read(fileData);
            fis.close();

            try (os; bos) {

                bos.write(fileData);

                bos.flush();

                System.out.println("파일 전송 완료");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
