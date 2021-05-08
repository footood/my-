package cn.tedu.util;

import java.util.Collections;
import java.util.HashSet;

/**
 * @author: 向双
 * @date: 2021年04月21日 14时57分
 * @description: 测试HashSet
 */
public class Test4 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //特点:不能重复+存一个null+无序
        Collections.addAll(set,1,24,34,1,5,24,null);
        set.add(2);
        System.out.println(set);
        System.out.println(set.hashCode());
        System.out.println(set.contains(1));
    }
}
