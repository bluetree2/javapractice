package ch19.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class App01Computer1 {
    public static void main(String[] args) throws IOException {
        // 1번 컴퓨터와 2번 컴퓨터 연결하기
        // 1번 컴퓨터
        // : 연걸 기다림
        ServerSocket serverSocket = new ServerSocket(9876);
        Socket socket = serverSocket.accept();

        // 1번 컴퓨터에서
        // 2번 컴퓨터로
        // "hello" 메세지 보내기

        OutputStream os = socket.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        try (bw; osw; os) {
            bw.write("hello");
            bw.flush();
        }

    }
}
