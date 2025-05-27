package ch18.lecture.p06file;

import java.io.File;

public class App01 {
    public static void main(String[] args) {
        // File : file 정보를 담고 있는 객체
        File f1 = new File("c:/Temp/nothing.txt");
        File f2 = new File("c:/Temp/bear.jpg");

        // exists :
        boolean r1 = f1.exists();
        System.out.println("r1 = " + r1);
        boolean r2 = f2.exists();
        System.out.println("r2 = " + r2);

        // getName :
        String p1 = f1.getName();
        System.out.println("p1 = " + p1);

        // length :
        long l2 = f1.length();
        System.out.println("l2 = " + l2);

        // isDiretory :
        boolean d2 = f2.isDirectory();
        System.out.println("d2 = " + d2);

        // isFile :
        boolean i2 = f2.isFile();
        System.out.println("i2 = " + i2);
    }
}
