package testTCP.upd2;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.Socket;
/*
* 多线程实现多用户上传
* */

public class UserThread implements Runnable{
    private Socket socket = null;

    public UserThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.currentTimeMillis()+".txt"));
            String line = null;
            while((line = br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(
                    socket.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();
            bw.close();
            socket.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
