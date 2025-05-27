package ch19.lecture;

import java.io.*;
import java.net.Socket;

public class App04Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("192.168.0.5", 9876);) {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);
            try (pw; osw; os; bw) {
                pw.println("안녕하세요. 저는 클라이언트 입니다.");
                pw.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
