package ch18.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class p01output {
    public static void main(String[] args) throws IOException {
        // output stream : (출력)프로그램에서 나가는 데이터 스트림
        // 1byte 씩 출력

        String filename = "c:/Temp/output1.data";
        OutputStream os = new FileOutputStream(filename);

        //int 값을 파라미터로 받아도
        // 끝의 8bit 만 사용하고 24bit는 무시함

        os.write(100); // 100
        os.write(200); // 200 -> -56
        os.write(300); // 300 -> 44

        System.out.println("프로그램 종료");


    }
}
