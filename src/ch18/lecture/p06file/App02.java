package ch18.lecture.p06file;

import java.io.*;

public class App02 {
    public static void main(String[] args) throws IOException {
        // 존재하지 않는 디렉토릴르 만드는 방법
      /*  String d1 = "c:/Temp/some";
        File f1 = new File(d1);
        System.out.println(f1.exists());

        if (!f1.exists()) {
            f1.mkdir();
        }
*/
        String d2 = "c:/Temp/some/sub";
        File f2 = new File(d2);
        System.out.println(f2.exists());

        if (!f2.exists()) {
            f2.mkdirs(); // 부모 디렉토리까지 모두 만들기
        }

        String file = "c:/Temp/some/sub/file2.txt";
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);
        try (ps; fos) {
            ps.println("Hello file");
            ps.flush();
        }

    }
}
