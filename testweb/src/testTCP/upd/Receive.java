package testTCP.upd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
/*
* TCP协议下服务端多次接收数据;
* */
public class Receive {
    public static void main(String[] args) throws IOException {
        //服务器Socket对象;
        ServerSocket s = new ServerSocket(11186);
        //监听客户端连接;
        Socket ss = s.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
        String line = null;
        while((line=br.readLine())!=null){
            if(line.equals("good bye")) break;
            System.out.println(line);
        }
        ss.close();
    }
}
