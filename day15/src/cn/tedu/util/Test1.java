package cn.tedu.util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
/**
 * @author: 向双
 * @date: 2021年04月21日 09时03分
 * @description: 测试LinkedList
 */
public class Test1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        Collections.addAll(list,9,8,7,6,5,4,null);
        System.out.println(list);
        list.addFirst(100);
        list.addLast(900);
        System.out.println(list);
        System.out.println(list.get(4));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list);
        System.out.println("第二套");
        System.out.println(list.offerFirst(11));
        System.out.println(list.offerLast(99));
        System.out.println(list);
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list);

        System.out.println(list);


    }
}
