package cn.tedu.io;

import java.io.*;
import java.util.Scanner;

/**
 * @author: 向双
 * @date: 2021年04月19日 14时44分
 * @description: IO练习
 */

public class Test2 {
    public static void main(String[] args){
        //1.提示并接收用户输入要复制的原文件的路径--复制啥
        System.out.println("请输入原文件路径:");
        String f = new Scanner(System.in).nextLine();
        //2.提示并接收用户输入的目标文件所在的路径--复制到哪
        System.out.println("请输入目标文件路径:");
        String t = new Scanner(System.in).nextLine();
        //3.根据原文件路径封装File对象from
        File from = new File(f);
        //4.根据目标文件路径封装File对象to
        File to = new File(t);
        //5.根据用户提供的路径完成文件的复制操作
        //5.1自定义字符流文件复制方法
        //ZFCopy(from,to);//字符流--只能操作字符相关文件
        ZJCopy(from, to);//字节流--什么文件都能操作
    }

    /**
     * 自定义字节复制文件的方法
     */
    public static void ZJCopy(
            File from, File to){
        //2.1创建字节输入流对象
        InputStream in=null;
        OutputStream out=null;
        try {
        in = new BufferedInputStream(
                new FileInputStream(from));
        //2.2创建字节输出流对象
            out = new BufferedOutputStream(
                new FileOutputStream(to));
        //3.完成复制操作--边读边写
       int b=0;
        long start = System.currentTimeMillis();

           byte[] buf = new byte[8192];
           while ((b=in.read(buf)) != -1) {
               out.write(buf,0,b);
           }
           long end = System.currentTimeMillis();
            System.out.println("恭喜您!复制成功!");
            System.out.println(end - start);
           //4.释放资源
           /**1.流资源必须释放,释放的是之前使用过程中的所有流对象
            * 2.关流是有顺序的,注意,后面出现的流先释放,为了不影响代码* */
       }catch (Exception e){
           e.printStackTrace();
       }
       finally {
            try {
                out.close();//用来关闭字符输出流
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();//用来关闭字符输入流
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
