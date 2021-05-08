package cn.tedu.util;

/**
 * @author: 向双
 * @date: 2021年04月22日 15时43分
 * @description:
 */
public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        Thread q = new Thread();
        System.out.println(q.getId());
        System.out.println(q.getName());
        q.setName("abc");
        System.out.println(q.getName());
        q.run();
        q.start();
        q.stop();
        Thread.sleep(1000);
        Thread q1 = Thread.currentThread();
        System.out.println(q1.getName());

    }
}
