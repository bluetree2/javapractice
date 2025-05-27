package ch19.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class App07Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9876);
        for (int i = 0; i < 10; i++) {
            Socket socket = serverSocket.accept();

            Thread thread = new Thread(() -> {
                try {
                    InputStream inputStream = socket.getInputStream();
                    InputStreamReader isr = new InputStreamReader(inputStream);
                    BufferedReader br = new BufferedReader(isr);

                    // request message
                    // 1번째 줄 : METHOD PATH VERSION
                    String line1 = br.readLine();

                    System.out.println("line1 = " + line1 + "");

                    // 2번째 줄부터 빈 줄까지 : header
                    String header = "";
                    while (!(header = br.readLine()).isEmpty()) {
                        System.out.println("header = " + header);
                    }


                    // 빈줄

                    // 요청 본문 ㅓ시작

                    //////////////
                    //////응답/////

                    OutputStream outputStream = socket.getOutputStream();
                    OutputStreamWriter osw = new OutputStreamWriter(outputStream);
                    PrintWriter pw = new PrintWriter(osw);
                    String html = """
                            <!DOCTYPE html>
                                <html>
                                    <body>
                                        <h1>서버 프로그래밍</h1>
                                        <h2>여러 클라이언트에게 보내는 HTMl</h2>
                                        <p> 어렵다 </p>
                                    </body>
                                </html>
                            """;


                    // 1번째 줄

                    // VERSION CODE STATUS
                    pw.println("HTTP/1.1 200 OK");
                    pw.println("Content-Type: text/html; charset=UTF-8");
                    pw.println("Content-Length: " + html.getBytes().length);
                    // 빈줄
                    pw.println("");

                    //응답 본문
                    pw.println(html);
                    pw.flush();

                    socket.close();
                    serverSocket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }


    }
}
