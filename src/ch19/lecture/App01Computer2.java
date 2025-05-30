package ch19.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class App01Computer2 {
    public static void main(String[] args) throws IOException {
        // 2번 컴퓨터
        // 1번 컴퓨터에 연결을 시도함
        Socket socket = new Socket("192.168.0.5", 9876);


        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        try (br; isr; is) {
            String message = br.readLine();
            System.out.println("message = " + message);
        }
    }
}
