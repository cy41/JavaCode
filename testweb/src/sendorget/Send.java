package sendorget;

/*
 * UDP协议发送数据
 * 1.创建发送端Socket对象 （DatagramSocket 用来接收发送数据报包的套接字）
 * 2.创建数据，打包数据（数据报包对象）
 * 3.调用Socket对象的发送方法发送数据包
 * 4.释放资源
 * */

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Send {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        //创建Socket对象;
        DatagramSocket datagramSocket = new DatagramSocket();
        while(true){
            System.out.println("请输入数据");
            String s="";
            s=sc.nextLine();
            if(s.equals("good bye")) break;
            //创建发送的数据;
            byte[] bys = s.getBytes();
            //长度;
            int len=bys.length;
            //IP地址对象;
            InetAddress address = InetAddress.getByName("DESKTOP-KP5GLHE");
            //端口;
            int port = 10086;
            //创建数据报包对象; 向addressIP地址上的端口为port的进程发送长度为len的byte[]数据;
            DatagramPacket datagramPacket = new DatagramPacket(bys,len,address,port);
            //发送;
            datagramSocket.send(datagramPacket);
        }
        //释放资源;
        //datagramSocket.close();

    }
}
