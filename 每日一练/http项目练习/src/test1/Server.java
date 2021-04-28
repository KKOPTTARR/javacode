package test1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {


        ServerSocket serversocket = new ServerSocket(8088);


        while(true) {
            Socket socket = serversocket.accept();
            System.out.println("TCB已建立");


            InputStream inputStream = socket.getInputStream();
            Scanner scanner = new Scanner(inputStream, "UTF-8");
            String line = scanner.nextLine();
            System.out.println(line);

            OutputStream outputStream = socket.getOutputStream();
            Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.printf("收到");
            printWriter.flush();

            System.out.println(line);
            socket.close();
        }

    }
}
