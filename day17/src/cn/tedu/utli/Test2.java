package cn.tedu.utli;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: 向双
 * @date: 2021年04月23日 10时50分
 * @description:
 */
public class Test2 {
    public static void main(String[] args) {
        My target = new My();
        ExecutorService pool = Executors.newFixedThreadPool(
                4);
        for (int i = 0; i < 4; i++) {
            //new Thread(target).start();
            pool.execute(target);
        }
    }
}

class My implements Runnable {
    int i = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (i > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "," + i--);
                } else {
                    break;
                }
            }
        }
    }
}
