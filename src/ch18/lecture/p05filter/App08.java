package ch18.lecture.p05filter;

import ch13.sec02.exam01.Product;

import java.io.*;

public class App08 {
    public static void main(String[] args) throws IOException {
        String file = "C:/Temp/Filter08.txt";
        try (Writer writer = new FilterWriter(file)) {
            writer.write('a');
            writer.write('b');
            writer.write('한');
        }

        //PrintWriter : Writer을 감싸는 filter stream
        // Print 출력하듯 기능하는 print.. 메소드들이 있음
        Writer writer = new PrintWriter(file);
        PrintWriter pw = new PrintWriter(writer);

        try (writer; pw) {
            pw.println("ab");
            pw.println("한글 가능");
            pw.println("🎇🎞️🎗️✨");
            pw.flush();
        }
    }
}
