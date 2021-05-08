
package cn.tedu.oop;
//测试 static代码块
public class Test6 {
    public static void main(String[] args) {
        new Student();

        //new Student();
        //new Student();
        //new Student();
        //new Student();
        //执行顺序:
        //当类加载时,执行静态代码块
        //当new/实例化时,执行 构造代码块和构造方法
        //当方法被调用时,执行 局部代码块
    }
}
class Student{
    //TODO 静态代码块:在成员位置+用来初始化项目+类加载时触发
    static {
        System.out.println("静态代码块");
    }
    //TODO Constructor:在成员位置+用来new
    public Student() {
        System.out.println("构造方法");
    }
    //TODO 构造代码块:在成员位置+用来提取构造方法里的共性+new时触发
    {
        System.out.println("构造代码块");
    }
    //TODO 局部代码块:在局部位置+用来控制变量的作用范围+调用方法时
    public void show() {
        {
            System.out.println("局部代码块");
        }
    }
}
