package cn.tedu.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author: 向双
 * @date: 2021年04月19日 11时11分
 * @description: 测试异常
 */
public class Test3 {
    public static void main(String[] args) {
       method();
       method2();
       method3();
    }

    private static void method3() {int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        System.out.println(a/b);

    }

    private static void method2() {
        try{
            int a = new Scanner(System.in).nextInt();
            int b = new Scanner(System.in).nextInt();
            System.out.println(a/b);
        }catch (AbstractMethodError a ){
            System.out.println("错误");
        }catch (InputMismatchException a){
            System.out.println("请输入两次整数");
        }catch (Exception a){
            System.out.println("请输入正确的数据");
        }
    }

    public static void method() {
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        System.out.println("a/b="+a/b);
    }
}
