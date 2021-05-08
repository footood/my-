package cn.tedu.io;

import java.io.*;

/**
 * @author: 向双
 * @date: 2021年04月19日 10时39分
 * @description:
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
       // method();
        method2();
    }
    private static void method2() throws IOException {
        OutputStream out = new BufferedOutputStream(
                new FileOutputStream(
                        "E:\\io\\1.txt",true));
        out.write(90);
        out.write(100);
        out.close();
        out.flush();
        out.write(99);


    }
        public static void method() throws IOException {
        OutputStream out = new FileOutputStream(
                "E:\\io\\1.txt",true);
        out.write(97);
        out.write(98);
        out.write(99);

        byte[] bs = {50,51,52};
        out.write(bs);
        out.close();
    }

}


