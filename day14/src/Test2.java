import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author: 向双
 * @date: 2021年04月20日 10时47分
 * @description: Collection接口
 */
public class Test2 {
    public static  void main(String[] args) {
        Collection<Integer> c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);

        System.out.println(c.contains(1));
        System.out.println(c.equals("jack"));
        //c.clear();//清空集合
        System.out.println(c.hashCode());//获取哈希码值
        System.out.println(c.isEmpty());//判断c是否为空
        System.out.println(c.remove(1));//移除1
        System.out.println(c.size());//获取集合的元素数
        Object[] o = c.toArray();//把c里的数据存入数组
        System.out.println(Arrays.toString(o));
        Iterator<Integer> it = c.iterator();
        while (it.hasNext()){
          Integer data =  it.next();
            System.out.print(data);
        }
        System.out.println("");
            for (Integer z:c) {
                System.out.print(z);
            }
            System.out.println("=================");
                Collection<Integer> c2 = new ArrayList<>();
                c2.add(1);
                c2.add(2);
                c2.add(3);
                //System.out.println(c.addAll(c2));//把c2加到c里
        System.out.println(c);
                System.out.println(c.containsAll(c2));//判断c里包含c2吗
                //System.out.println(c.removeAll(c2));//移除c和c2的交集
                System.out.println(c.retainAll(c2));//保留c和c2的交集
        System.out.println(c);


    }
}
