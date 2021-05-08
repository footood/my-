
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author: 向双
 * @date: 2021年04月20日 14时38分
 * @description:
 */
public class Test3 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("q"+"w");
        System.out.println(l.add("a"));
        System.out.println(l.add(null));
        System.out.println(l);
        //l.clear();
        System.out.println(l.contains("a"));
        System.out.println("=============");
        l.add(1,"c");
        l.add(1,"d");
        l.add(1,"f");
        l.add(1,"c");
        System.out.println(l);
        System.out.println(l.get(1));
        System.out.println(l.indexOf("c"));
        System.out.println(l.lastIndexOf("c"));
        System.out.println("===============");

        System.out.println(l.remove(0));
        System.out.println(l.set(3,"g"));
        System.out.println(l);
        System.out.println(l.subList(0,6));
        l.remove("a");
        l.remove(4);
        System.out.println(l);

        //TODO 迭代List 接口中元素的方式


        List<String> l2 = new ArrayList<String>();
        System.out.println(l.containsAll(l2));
        System.out.println(l.equals(l2));
        System.out.println(l.hashCode());
        //System.out.println(l.remove(1));
        System.out.println(l.size());
        System.out.println(l.toArray());
        l2.add("q"+"w");
        System.out.println(l.isEmpty());// 如果列表不包含元素，则返回 true。
        // System.out.println(l.toArray(T[]l2));
        System.out.println("====================");


        Iterator<String> it = l.iterator();
        //1
        while (it.hasNext()){
            String data = it.next();
            System.out.println(data);
        }
        //2
        for (int i = 0; i <l.size() ; i++) {
            String data = l.get(i);
            System.out.println(data);
        }
        System.out.println("===================");

        //3
        for (String s:l) {
            System.out.println(s);
        }

        ListIterator<String> it2 = l.listIterator();
        while (it2.hasNext()){
            String data = it2.next();
        }

        while(it2.hasPrevious()){
            String data = it2.previous();
            System.out.println("data+"+data);
            //面试题1: 数组和聚合的区别
            //面试题2: List接口的迭代方式
            //面试题2: iterator()和ListIterator()的区别
            //前者是父接口Iterator提供的,后者是ListIterator子接口提供的
            //ListIterator子接口可以使用父接口的所有的功能,还可以扩展
            //List
        }
    }
}
