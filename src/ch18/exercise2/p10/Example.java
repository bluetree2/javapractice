package ch18.exercise2.p10;

import java.io.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws IOException {
        String origin = "C:/Temp/dir1/lion.jpg";
        String target = "C:/Temp/dir2/lion.jpg";

        String d1 = "C:/Temp/dir1";
        String d2 = "C:/Temp/dir2";
        File f1 = new File(origin);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("원본 파일 경로: ");
        origin = br.readLine();

        System.out.println("복사 파일 경로: ");
        target = br.readLine();

        if (f1.exists()) {
            int lastSlashIndex = d2.lastIndexOf("/");
            File directory = new File(d2.substring(0, lastSlashIndex));
            if (!directory.exists()) {
                directory.mkdirs(); // 부모 디렉토리까지 모두 만들기
            }

            // 파일 목사 코드 작성
            // bufferdInputStream, bufferedOutputStream 활용
            InputStream is = new FileInputStream(origin);
            OutputStream os = new FileOutputStream(target);
            BufferedInputStream bis = new BufferedInputStream(is);
            BufferedOutputStream bos = new BufferedOutputStream(os);

            try (bos; bis; os; is) {
                byte[] data = new byte[1024];
                while (true) {
                    int num = bis.read(data);
                    if (num == -1) break;
                    bos.write(data, 0, num);
                }
                bos.flush();
            }


            System.out.println("복사가 성공되었습니다.");
        } else {
            System.out.println("원본 파일이 존재하지 않습니다.");
        }

    }
}
