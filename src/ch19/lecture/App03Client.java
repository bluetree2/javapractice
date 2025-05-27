package ch19.lecture;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class App03Client {
    public static void main(String[] args) throws Exception {

        String file = "c:/temp/download.jpg";

        // client : server에 연결 시도

        Socket socket = new Socket("192.168.0.38", 9876);

        try (socket) {

            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            // is로 파일 받기
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);


            try (is; bis; fos; bos) {

                byte[] data = new byte[1024];
                int len = 0;

                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
        }
    }
}
