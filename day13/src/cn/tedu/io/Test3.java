package cn.tedu.io;

import java.io.*;

/**
 * @author: 向双
 * @date: 2021年04月19日 15时32分
 * @description:
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入:");
            InputStream in = null;
            try {
                in = new BufferedInputStream(System.in);
            int b = 0;
            while ((b=in.read())!=-1){
                System.out.println(b);
                System.out.println("成功");
            }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                TOUtils.close(in);
            }
    }
            }

