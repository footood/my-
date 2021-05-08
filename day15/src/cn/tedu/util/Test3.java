package cn.tedu.util;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author: 向双
 * @date: 2021年04月21日 14时36分
 * @description: 测试contains
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        Collections.addAll(list,1,2,3,4,5,6,2,3,4,3,4);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        HashSet<Integer> list2= new HashSet();
        for (Integer data:list) {
            list2.add(data);
//            if(list1.contains(data)){
//                System.out.println("数字"+data+"重复");
//            }else {
//                list1.add(data);
//            }
        }
        System.out.println(list2);
        //System.out.println(list1);
    }
}
