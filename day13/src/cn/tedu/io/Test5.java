package cn.tedu.io;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 向双
 * @date: 2021年04月19日 17时28分
 * @description: 测试 泛型
 */
public class Test5 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(1.6);
        list.add("fd");
        list.add(true);
        list.add('任');
        list.add(new Object());
        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.add("jj");
        list2.add("kk");
        list2.add("97");
        System.out.println(list2);

        List<Integer> list3 = new ArrayList();
        list3.add(97);//自动装箱 new Integer(97)
        list3.add(new Integer(98));
        list3.add(99);
        list3.add(100);
        System.out.println(list3);
    }
}
