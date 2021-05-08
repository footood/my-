package cn.tedu.opp;

import org.w3c.dom.ls.LSOutput;

/**
 * @author: xiang shuang
 * @date: 2021年04月17日 15时57分
 * @description: 测试 继承里的构造方法
 *总结:
 * 1,构造方法的作用是:用来灵活的new
 * 2,继承后,子类构造方法里会隐藏super()--意思是会自动调用父类的无参构造
 * 3,如果父类没给无参构造,子类,只能调用父类的含参构造
 */
public class Test3 {
    public static void main(String[] args) {
        new Zi3();
    }
}

class Fu3{
    //TODO
    public Fu3(){
        System.out.println(1);
    }
    public Fu3(int a ){
        System.out.println(100);
    }
}
class Zi3 extends Fu3{
   public Zi3(){
    //1,构造方法里,隐藏了super(),会自动调用父类的 无参的 构造方法！
    //		//3,super关键字,如果出现在了构造方法里,必须是第一条语句
    //		super();
    super(666);//2,触发的是父类的含参构造方法
    System.out.println(2);
}
}


