package testTCP.upd2;

import java.io.*;
import java.net.Socket;
/*
* TCP协议下上传文件;
* */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.63.1",11186);
        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                socket.getOutputStream()));
        String line = null;
        while((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        socket.shutdownOutput();//终止条件传递给服务器端;
        //bw.close();

        //接收服务端的反馈;
        BufferedReader brClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        line = brClient.readLine();
        brClient.close();
        System.out.println(line);
        br.close();
        socket.close();
    }
}
