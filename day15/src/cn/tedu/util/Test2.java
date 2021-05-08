package cn.tedu.util;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author: 向双
 * @date: 2021年04月21日 11时39分
 * @description: 测试ArrayList和inkedlist的查询效率
 */
public class Test2 {
    public static void main(String[] args) {
        method1();//ArrayList查询
         method2();//LinkedList查询
    }

    private static void method2() {
        LinkedList<Integer> list = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i <550000 ; i++) {
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Linked增加"+(end-start));
//        long start1 = System.currentTimeMillis();
//        for (int i = 0; i <list.size() ; i++) {
//            Integer data=list.get(i);
//            //System.out.println(data);
//        }
//        long end1 = System.currentTimeMillis();
//        System.out.println("Linked查询"+(end1-start1));

    }

    private static void method1() {
        long start1 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i <550000 ; i++) {
            list.add(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Array增加"+(end1-start1));
//        long start = System.currentTimeMillis();
//        for (int i = 0; i <list.size() ; i++) {
//            Integer data=list.get(i);
//            //System.out.println(data);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("Array查询"+(end-start));
    }
}
