package ch18.lecture.p02input;

import java.io.*;

public class App05 {
    public static void main(String[] args) throws IOException {
        // ./images/bear.jpg
        // 파일을 읽어서
        String inputFileName = "./images/bear.jpg";
        InputStream is = new FileInputStream(inputFileName);

        // c:/Temp/bear.jpg
        // 복사하기
        String outputFileName = "c:/Temp/bear.jpg";
        OutputStream os = new FileOutputStream(outputFileName);


        try (is; os;) {

            byte[] bucket = new byte[100];
            int length = 0;
            while ((length = is.read(bucket)) != -1) {
                os.write(bucket, 0, length);
            }

            os.flush();
        }

        System.out.println("파일 복사 종료");


    }
}
