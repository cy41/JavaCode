package testUDP.upd;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/*
* 发送端线程;
* */
public class SendThread implements Runnable{

    private DatagramSocket datagramSocket;
    public static Scanner sc = new Scanner(System.in);
    public SendThread(DatagramSocket datagramSocket) {
        this.datagramSocket = datagramSocket;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("请输入数据");
            String s=sc.nextLine();
            if(s.equals("good bye")) break;
            //创建发送的数据;
            byte[] bys = s.getBytes();
            //端口;
            int port = 10086;
            //创建数据报包对象; 向addressIP地址上的端口为port的进程发送长度为len的byte[]数据;
            DatagramPacket datagramPacket = null;
            try {
                datagramPacket = new DatagramPacket(bys,bys.length,
                        InetAddress.getByName("DESKTOP-KP5GLHE"),port);
                //发送;
                datagramSocket.send(datagramPacket);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //释放资源;
        datagramSocket.close();
    }
}
