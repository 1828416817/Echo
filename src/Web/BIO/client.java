package Web.BIO;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8080);
        while(true){
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            socket.getOutputStream().write(str.getBytes());
            socket.close();
        }
    }
}
