package Web;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIP {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip);
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());
        System.out.println("***************************");
        InetAddress inetAddress = InetAddress.getByName("activate.navicat.com");
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress);
    }
}
