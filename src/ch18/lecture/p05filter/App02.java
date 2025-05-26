package ch18.lecture.p05filter;

import java.io.*;

public class App02 {
    public static void main(String[] args) throws IOException {
        String fileName = "src/ch18/lecture/p05filter/App02.java";

        try (Reader reader = new FileReader(fileName);
             BufferedReader br = new BufferedReader(reader);) {
//            int r1 = reader.read();
//            int r2 = reader.read();
//            System.out.println("(char) r1 = " + (char) r1);
//            System.out.println("(char) r2 = " + (char) r2);

            String l1 = br.readLine();
            String l2 = br.readLine();
            String l3 = br.readLine();


            System.out.println("l1 = " + l1);
            System.out.println("l2 = " + l2);
            System.out.println("l3 = " + l3);

            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println("line = " + line);
            }
        }
    }
}
