package sendorget;
/*
* UDP协议接收数据
* 1.创建接收端Socket对象
* 2.创建一个数据报包对象
* 3.调用Socket对象的接收数据
* 4.解析数据，显示
* 5.释放资源
*
* */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Receive {
    public static void main(String[] args) throws IOException {
        //接收对象;
        DatagramSocket datagramSocket = new DatagramSocket(10086);
        while(true){

            //创建接收数据报包对象;
            byte[] bys = new byte[1024];
            int len=bys.length;
            DatagramPacket datagramPacket = new DatagramPacket(bys,len);
            //接收数据;
            datagramSocket.receive(datagramPacket);//阻塞式方法;
            //获取数据;
            byte[] bys2 = datagramPacket.getData();
            len = bys2.length;
            //获取发送方的ip地址;
            InetAddress address = datagramPacket.getAddress();
            String ip = address.getHostAddress();
            String s = new String(bys2,0 ,len);
            System.out.println(s+" "+ip);
        }
        //释放资源;
        //datagramSocket.close();

    }
}
