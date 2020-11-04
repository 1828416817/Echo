package Web;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(5051);
        byte[]receiveBuf = new byte[100];
        DatagramPacket packet = new DatagramPacket(receiveBuf,receiveBuf.length);
        System.out.println("等待你包裹来........");
        while (true){
            //接收包裹
            socket.receive(packet);
            String receiveStr = new String(packet.getData(),0,packet.getLength());
            System.out.println("我收到了:"+receiveStr);
            if (receiveStr.equals("quit")){
                break;
            }
        }
     socket.close();
    }
}
