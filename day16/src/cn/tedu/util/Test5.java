package cn.tedu.util;

/**
 * @author: 向双
 * @date: 2021年04月22日 17时30分
 * @description:
 */
public class Test5 {
    public static void main(String[] args) {
        My r = new My();
        Thread t =new Thread(r);
        Thread t1 =new Thread(r);
        Thread t2 =new Thread(r);
                 t.start();
                 t1.start();
                 t2.start();
    }
}
class My implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" 第"+i+"个,");
        }
    }

}
