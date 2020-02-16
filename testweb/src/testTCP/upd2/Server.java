package testTCP.upd2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/*
* TCP协议下多用户上传文件;
* */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(11186);
        while(true){
            Socket s = ss.accept();
            new Thread(new UserThread(s)).start();//针对每个客户端建立一个线程;
        }
    }
}
