package ch18.lecture.p05filter;

import java.io.*;

public class App04 {
    public static void main(String[] args) throws FileNotFoundException {
        long start = 0;
        long end = 0;
        long diff = 0;

        // bufferedOutputStream
        start = System.nanoTime();
        bufferedOutputStream();
        end = System.nanoTime();
        diff = end - start;
        System.out.println("bos diff = " + diff);
        // BufferedInputStream
        start = System.nanoTime();
        bufferedInputStream();
        end = System.nanoTime();
        diff = end - start;
        System.out.println("bis diff = " + diff);
        // OutputStreamWriter
        start = System.nanoTime();
        outputStream();
        end = System.nanoTime();
        diff = end - start;
        System.out.println("os diff = " + diff);
        // InputStreamReader
        start = System.nanoTime();
        inputStream();
        end = System.nanoTime();
        diff = end - start;
        System.out.println("is diff = " + diff);
    }

    private static void outputStream() throws FileNotFoundException {
        String file = "C:/Temp/filter042.data";
        OutputStream os = new FileOutputStream(file);
//        BufferedOutputStream bos = new BufferedOutputStream(os);

        byte[] data = new byte[1024];
        try (os) {
            for (int i = 0; i < 100 * 1024; i++) {
                os.write(data);
            }

            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void inputStream() {
        String file = "C:/Temp/filter041.data";
        try {
            InputStream is = new FileInputStream(file);
//            BufferedInputStream bis = new BufferedInputStream(is);

            try (is;) {
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = is.read(data)) != -1) {
                    //
                }
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private static void bufferedInputStream() {
        String file = "C:/Temp/filter041.data";
        try {
            InputStream is = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(is);

            try (is; bis) {
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    //
                }
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    private static void bufferedOutputStream() throws FileNotFoundException {
        String file = "C:/Temp/filter041.data";
        OutputStream os = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        byte[] data = new byte[1024];
        try (bos; os) {
            for (int i = 0; i < 100 * 1024; i++) {
                bos.write(data);
            }

            bos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
