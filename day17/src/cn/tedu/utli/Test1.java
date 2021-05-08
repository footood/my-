package cn.tedu.utli;

import java.io.DataOutput;

/**
 * @author: 向双
 * @date: 2021年04月23日 09时41分
 * @description:
 */
public class  Test1{
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            new Myticket().start();
        }
    }
}
class Myticket extends Thread{
    static int i = 100;

    @Override
    public void run() {
    while(true) {
        synchronized(Myticket.class){
        if (i > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(super.getName()+","+i--);
        }else {
            break;
        }
        }
    }
    }

}