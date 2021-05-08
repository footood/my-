package cn.tedu.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author: 向双
 * @date: 2021年04月27日 10时58分
 * @description: 客服端
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("176.199.107.4",8000);
        System.out.println("客户端连接成功");
        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();

        out.write("hello".getBytes());
        // out.close();
       out.flush();

        for (int i = 0; i <5 ; i++) {
            char c = (char)in.read();
            System.out.print(c);
        }
        socket.close();
    }
}
