package cn.tedu.util;

/**
 * @author: 向双
 * @date: 2021年04月22日 16时58分
 * @description:
 */
public class Test4 {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {

            new MyThread().start();
        }


    }
}
class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <10; i++) {
            System.out.println(super.getName()+"==="+i+",");
        }
    }
}