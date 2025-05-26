package ch18.lecture.p02input;

import java.io.*;
import java.util.Arrays;

public class App03 {

    public static void main(String[] args) throws IOException {

        // inputstream 에서 사용할 파일을 먼저 만들기
        String fileName = "c:/Temp/input3.data";
        try (OutputStream os = new FileOutputStream(fileName)) {
            for (int i = 0; i < 35; i++) {
                os.write(i);
            }
        }
        System.out.println("파일 만들기 종료");

        // input stream으로 읽기
        InputStream is = new FileInputStream(fileName);

        byte[] datas = new byte[10];
        int r1 = is.read(datas); // 몇 byte 읽었는지 return
        System.out.println("Arrays.toString(datas) = " + Arrays.toString(datas));
        int r2 = is.read(datas);
        System.out.println("Arrays.toString(datas) = " + Arrays.toString(datas));
        int r3 = is.read(datas);
        System.out.println("Arrays.toString(datas) = " + Arrays.toString(datas));
        int r4 = is.read(datas);
        System.out.println("Arrays.toString(datas) = " + Arrays.toString(datas));
        int r5 = is.read(datas);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);
    }
}
