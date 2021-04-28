package test1;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("127.0.0.1",8088);

        InputStream inputStream = socket.getInputStream();
        Scanner scanner = new Scanner(inputStream,"UTF-8");

        OutputStream outputStream = socket.getOutputStream();
        Writer writer = new OutputStreamWriter(outputStream,"UTF-8");
        PrintWriter printWriter = new PrintWriter(writer);

        printWriter.printf("收到请回复：");
        printWriter.flush();

        String message = scanner.nextLine();
        System.out.println(message);

        //Thread.sleep(10000);

        socket.close();
    }
}
