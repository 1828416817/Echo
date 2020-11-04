package Echo;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket client = serverSocket.accept();
        Scanner scanner = new Scanner(client.getInputStream());
        scanner.useDelimiter("\n");
        PrintStream printStream = new PrintStream(client.getOutputStream());
        boolean flag = true;
        while(flag){
            if (scanner.hasNext()){
                String val = scanner.next().trim();
                if ("byebye".equalsIgnoreCase(val)){
                    printStream.println("ByeBye......");
                }else {
                    printStream.println("Error");
                }
            }
        }
        scanner.close();
        printStream.close();
        client.close();
        serverSocket.close();
    }
}
