package cn.tedu.inner;

/**
 * @author: 向双
 * @date: 2021年04月26日 15时48分
 * @description:
 */
public class Test4{
    public static void main(String[] args) {
        A.B a = new A().new B();
        a.in();
        new A().out();
        System.out.println(new A.D().f);
        System.out.println(A.D.m);
    }
}
class A{//外部类
    String name = "jack";
    public void out(){
        System.out.println("out...");

        System.out.println(new C().b);
    }
    class B{

        int age = 10;
        public void in(){
            System.out.println("in...");
        }
    }
    private static class C{
        double b =  5.1;
        public void to(){

        }
}
    static class D{
        double f =  9.9;
        static int m = 13;
        public void po(){

        }
    }
}