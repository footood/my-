package cn.tedu.util;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: 向双
 * @date: 2021年04月22日 11时35分
 * @description:
 */
public class Test2 {
    public static void main(String[] args) {
        String ff = "hello.txt";
        String[] b = ff.split("\\.");
        String keyy = b[0];
        String valuee = b[1];
        int index = ff.indexOf(".");
        String keyy2 = ff.substring(0,index);
        String valuuee2 = ff.substring(index+1);
        System.out.println(keyy2);
        System.out.println(valuuee2);


        //需求:列出文件夹的所有资源,存入map中
        String dir = "E:\\io";
       File file = new File(dir);
       File[] a = file.listFiles();
        HashMap<String,String> map = new HashMap();

        String key;
        String  value;

        for (int i = 0; i <a.length ; i++) {
            if(a[i].isFile()){
                key = a[i].getName().split("\\.")[0];
                value= a[i].getName().split("\\.")[1];
                map.put(key,value);
        }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(map);
    }
}
