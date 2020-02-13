package testTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
* TCP协议发送数据
* 1.创建发送端的Socket对象，若成功则说明连接建立成功
* 2.获取输出流，写数据
* 3.释放资源
* */
public class Client {
    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象;
        Socket socket = new Socket("192.168.63.1",12386);
        //获取输出流;
        OutputStream os = socket.getOutputStream();
        //写数据;
        os.write("hello world".getBytes());

        //从客户端接收回传信息;
        InputStream inputStream = socket.getInputStream();
        byte[] bys = new byte[1024];
        int len = inputStream.read(bys);
        String res = new String(bys,0,len);
        System.out.println(res);
        //释放资源;
        socket.close();
    }
}
