package testUDP.upd;

import java.io.IOException;
import java.net.DatagramSocket;

/*
* 多线程改进聊天;
* */
public class testUDP {
    public static void main(String[] args) throws IOException {
        ReceiveThread receiveThread = new ReceiveThread(new DatagramSocket(10086));
        SendThread sendThread = new SendThread(new DatagramSocket());
        Thread send = new Thread(sendThread);
        Thread receive = new Thread(receiveThread);
        receive.start();
        send.start();
    }

}
