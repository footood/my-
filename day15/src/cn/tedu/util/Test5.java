package cn.tedu.util;

import java.util.*;

import static javafx.scene.input.KeyCode.K;

/**
 * @author: 向双
 * @date: 2021年04月21日 16时01分
 * @description: 测试 Map
 */
public class Test5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap();
        map.put(5, "你");
        map.clear();
        map.put(1, "我");
        map.put(2, "是");
        map.put(3, "帅");
        map.put(4, "哥");
        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("是"));
        System.out.println(map.equals("帅"));
        System.out.println(map.get(1));
        System.out.println(map.hashCode());
        System.out.println(map.size());
        System.out.println(map.remove(2));
        System.out.println(map);
        System.out.println(map.keySet());
        //{1=我, 3=帅, 4=哥}
        Set<Integer> keys = map.keySet();
        for (Integer k : keys) {
            String v = map.get(k);
            if (v.equals("帅")) {
                System.out.println("是");
            }
            System.out.println(K + ",,," + v);
        }
        Collection<String> value = map.values();
        for (String v : value) {
            System.out.println("v=" + v);
        }
        Set<Map.Entry<Integer, String>> entrys = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrys) {
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.println(k + "是" + v);
        }

    }
}
