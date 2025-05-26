package ch18.exercise.p10;

import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException {
        String origin = "images/eagle.jpg";
        String target = "C:/Temp/eagle.jpg";

        // 파일 목사 코드 작성
        // bufferdInputStream, bufferedOutputStream 활용

        try {

            InputStream is = new FileInputStream(origin);
            BufferedInputStream bis = new BufferedInputStream(is);
            OutputStream os = new FileOutputStream(target);
            BufferedOutputStream bos = new BufferedOutputStream(os);

            byte[] data = new byte[1024];
            while (true) {
                int num = bis.read(data);
                if (num == -1) break;
                bos.write(data, 0, num);
            }

            bos.flush();
            bos.close();
            bis.close();
        } catch (IOException e) {
            System.out.println("원본 파일이 존재하지 않습니다.");
            e.printStackTrace();
        }

        System.out.println("복사가 성공되었습니다.");


    }
}
