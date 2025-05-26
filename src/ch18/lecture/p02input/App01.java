package ch18.lecture.p02input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class App01 {
    public static void main(String[] args) {
        // input Stream (입력 스트림) : 프로그램으로 데이터를 읽는 스트림

        String filename = "c:/Temp/output1.data";
        try {
            InputStream is = new FileInputStream(filename);

            // read : 1byte를 읽어서 int 리턴(나머지 3바이트는 0으로 채움)
            int r1 = is.read(); // 100
            int r2 = is.read(); // 200 -> -56
            int r3 = is.read(); // 300 -> 44
            int r4 = is.read(); // 더이상 읽을 것이 없으면 -1 리턴

            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
            System.out.println("r3 = " + r3);
            System.out.println("r4 = " + r4);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
