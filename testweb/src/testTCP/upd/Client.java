package testTCP.upd;

import java.io.*;
import java.net.Socket;
/*
* TCP协议下客户端多次发消息;
* */
public class Client {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象;
        Socket s = new Socket("192.168.63.1",11186);
        //键盘录入数据，将键盘输入字节流转换为字符流，再用缓冲流包装;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //将通道内的流包装一下;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line = null;
        while((line= br.readLine())!=null){
            if(line.equals("good bye")) break;
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();

    }
}
