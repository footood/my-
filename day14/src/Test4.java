import java.util.*;

/**
 * @author: 向双
 * @date: 2021年04月20日 16时43分
 * @description: 测试 ArrayList接口
 */
public class Test4 {
    public static void main(String[] args) {
        //1,创建对象
        ArrayList<Integer> a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(null);
        System.out.println(a);
        a.add(0,9);
        System.out.println(a);
//集合的工具类Collections

        method1();  //TODO练习:最大值,最小值
        method2();//TODO练习:求List里的偶数和,奇数个数,平均数
    }

    private static void method2() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list ,61,32,13,84,56,67,49,75);
        System.out.println(list);
        int sum = 0;
        int count=0;
        int all=0;
        for (Integer data :list){
            all=all+data;
            if(data%2==0){
                sum = sum+data;
            }
            if(data%2==1){
                count++;
            }
        }
        System.out.println("平均数是"+all/list.size());
        System.out.println("偶数和是"+sum);
        System.out.println("奇数个数是:"+count);
    }

    private static void method1() {

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list ,1,2,3,4,56,7,9,7);
        System.out.println(list);
        System.out.println("最大值是:"+Collections.max(list));
        System.out.println("最小值是:"+Collections.min(list));
        Collections.sort(list);//[1, 2, 3, 4, 7, 7, 9, 56]
        System.out.println(list);
    }
}
