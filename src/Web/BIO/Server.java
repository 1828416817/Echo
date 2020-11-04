package Web.BIO;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    static byte[]bs = new byte[1024];
    public static void main(String[] args) throws IOException {
        //1设置一个监听
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true){
            //阻塞 放弃cpu
            System.out.println("wait connection");
            Socket ClientSocket = serverSocket.accept();//等待客户端连接
            System.out.println("connection success");
            System.out.println(" wait data");
            int read = ClientSocket.getInputStream().read(bs);
            if (read>0){
                System.out.println("data success");
                System.out.println(new String(bs));
            }


        }
    }
}
