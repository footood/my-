package cn.tedu.server;

import java.io.*;

/**
 * @author: 向双
 * @date: 2021年04月27日 15时49分
 * @description: jdk7,自动资源管理\catch多个类型异常
 */
public class Test5 {
    public static void main(String[] args) {
        method();
        method2();
    }

    private static void method2() {

    }

    private static void method(){
        InputStream in=null;
        try {
            in = new BufferedInputStream(
                    new FileInputStream(
                            "E:\\io\\1.txt"));
            int data = in.read();
            System.out.println(data);
        } catch (NullPointerException | IOException e) {
            e.printStackTrace();
            System.out.println("读取失败");
        }finally {
            if(in!=null){
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
    }
}
