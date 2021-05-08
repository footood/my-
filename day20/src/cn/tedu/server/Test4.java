package cn.tedu.server;

import java.util.Arrays;

import static sun.misc.Version.print;

/**
 * @author: 向双
 * @date: 2021年04月27日 15时33分
 * @description: jdk5 可变参数
 */
public class Test4 {
    public static void main(String[] args) {
        print(1);
        print(1);
        print(1,2);
        print(1,2,3,4,5);
    }

    private static void print(int... a) {
        int sum = 0;
        for (int i : a) {
            sum = sum+i;
        }
        System.out.println(sum);
//        System.out.println(a);
       System.out.println(Arrays.toString(a));
    }
}
