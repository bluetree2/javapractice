package ch18.lecture.p03writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App03 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:/Temp/writer03.txt");
        writer.write('a');
        writer.write('한');
        writer.write('\u2669');
//        writer.write('\uf169');
        writer.write("🧢"); // unicode
        
        writer.flush();
        writer.close();
    }
}
