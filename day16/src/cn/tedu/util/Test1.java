package cn.tedu.util;

import java.util.HashMap;

/**
 * @author: 向双
 * @date: 2021年04月22日 09时35分
 * @description:
 */
public class Test1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap();
        map.put(1,"我");
        map.put(2,"是");
        map.put(3,"大");
        map.put(4,"帅");
        map.put(5,"哥");
        map.put(6,"吗");
        System.out.println(map);
        for (Integer a:map.keySet()
             ) {
            System.out.print(a+"说是,");
        }
    }
}
