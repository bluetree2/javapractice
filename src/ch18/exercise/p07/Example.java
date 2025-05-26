package ch18.exercise.p07;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath = "src/ch02/sec01/VariableUseExample.java";

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;
        while (true) {
            rowData = br.readLine();
            if (rowData == null) break;
            rowNumber++;
            System.out.println(rowNumber + ": " + rowData);
        }

        br.close();
        fr.close();

    }
}
