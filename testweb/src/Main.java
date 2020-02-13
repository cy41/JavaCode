import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress =InetAddress.getByName("DESKTOP-KP5GLHE"); //根据主机名获取;
        String name = inetAddress.getHostName(); //获取主机名;
        String address = inetAddress.getHostAddress(); //获取IP地址;
        System.out.println(name);
        System.out.println(address);
    }
}
