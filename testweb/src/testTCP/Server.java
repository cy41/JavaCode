package testTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
* TCP协议接收数据
* 1.创建接收端的Socket对象（ServerSocket）
* 2.监听客户端连接，返回一个对应的Socket对象（三次握手）
* 3.获取输入流
* 4.释放资源
* TCP服务器端不应该关闭，时刻等待不同客户端的连接，
* 故每次与客户端通信完成后，应释放与该客户端的连接。
* */
public class Server {
    public static void main(String[] args) throws IOException {
        //创建;
        ServerSocket serverSocket = new ServerSocket(12386);
        //监听客户端连接，返回一个Socket对象
        Socket socket = serverSocket.accept();//阻塞方法，等待客户端连接;
        //获取输入流;
        InputStream is = socket.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String s = new String(bys,0,len);
        String ip = socket.getInetAddress().getHostAddress();
        System.out.println(ip+" "+s);

        //给客户端写一个数据表示已收到数据;
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("I get it".getBytes());
        //关闭与该客户端的连接，释放资源;
        socket.close();
    }
}
