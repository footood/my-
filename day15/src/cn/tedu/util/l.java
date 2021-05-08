package cn.tedu.util;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: 向双
 * @date: 2021年04月21日 18时56分
 * @description:
 */
public class l {
    public static void main(String[] args) {
//TODO map练习:统计用户输入的字符出现次数
        System.out.println("请输入:");
        String input = new Scanner(System.in).nextLine();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for (int i = 0; i <input.length() ; i++) {
            char key = input.charAt(i);
            Integer value = map2.get(key);
            if(value == null){
                map2.put(key,1);
            }else{
                map2.put(key,(value+1));
            }
        }
        System.out.println(map2);

    }
}
