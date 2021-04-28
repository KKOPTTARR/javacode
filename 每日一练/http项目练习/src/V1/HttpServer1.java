package V1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer1 {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8088);

        while(true) {
            Socket socket = serverSocket.accept();


            //暂时不需要解析请求


            //直接写回响应
            OutputStream outputStream = socket.getOutputStream();
            Writer writer = new OutputStreamWriter(outputStream,"UTF-8");
            PrintWriter printWriter = new PrintWriter(writer);



            //写响应

            //响应行
            printWriter.printf("HTTP/1.0 200 OK\r\n");
            //响应头
            printWriter.printf("Content-Type: text/html;charset=utf-8\r\n");
            //响应体
            printWriter.printf("<h1>正常工作了</h1>");
            //刷新
            printWriter.flush();


            socket.close();
        }
    }
}
