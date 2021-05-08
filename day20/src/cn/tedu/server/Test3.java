package cn.tedu.server;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;

/**
 * @author: 向双
 * @date: 2021年04月27日 14时53分
 * @description:
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入数字");
        String input = new Scanner(System.in).nextLine();
        String sj = "1[0-9]{10}";
        if(input.matches(sj)) {
            System.out.println("手机号正确");
        }else System.out.println("手机号错误");

        String sf = "[0-9]{17}[0-9x]";
        if(input.matches(sf)){
            System.out.println("身份证正确");
        }else {
            System.out.println("身份证错误");
        }
    }  }

