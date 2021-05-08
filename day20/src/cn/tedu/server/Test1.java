package cn.tedu.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: 向双
 * @date: 2021年04月27日 10时50分
 * @description: 服务端
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8000);
        System.out.println("服务器已启动");
        Socket socket = server.accept();
        System.out.println("服务器收到一个连接请求...");

        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
//        int b = in.read();
//        System.out.println(b);

        for (int i = 0; i <5 ; i++) {
            char c = (char)in.read();
            System.out.print(c);
        }

        out.write("world".getBytes());
       out.close();
        //  out.flush();

        socket.close();
        server.close();
    }
}
