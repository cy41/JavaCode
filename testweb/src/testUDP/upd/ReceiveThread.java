package testUDP.upd;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
* 接收端线程;
* */
public class ReceiveThread  implements Runnable{

    private DatagramSocket datagramSocket;

    public ReceiveThread(DatagramSocket datagramSocket) {
        this.datagramSocket = datagramSocket;
    }

    @Override
    public void run() {
        while(true){

            //创建接收数据报包对象;
            byte[] bys = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bys,bys.length);
            //接收数据;
            try {
                datagramSocket.receive(datagramPacket);//阻塞式方法;
            } catch (IOException e) {
                e.printStackTrace();
            }
            //获取数据;
            byte[] bys2 = datagramPacket.getData();
            //获取发送方的ip地址;
            InetAddress address = datagramPacket.getAddress();
            String ip = address.getHostAddress();
            String s = new String(bys2,0 ,bys2.length);
            System.out.println(s+" "+ip);
        }
        //释放资源;
        //datagramSocket.close();
    }
}
