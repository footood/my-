/**
 * @author: xiang shuang
 * @date: 2021年04月17日 12时51分
 * @description: 测试thic关键字
 * 总结:
 * 1,this代表本类对象的一个引用,相当于this帮你创建一个本类的对象
 * 2,this可以调用同一个类里的所有资源(成员变量/方法/构造方法)
 * 3,this使用的第一个场景是:用来区别同名的成员变量和局部变量,this调用的一定是成员变量
 * 4,this使用的第二个场景是:用来在构造方法间互相调用
 * 位置必须是第一条语句+不能形成类似于死循环的样子
 */
public class Test4 {
    public static void main(String[] args){
        new Animal();
    }
}
class Animal {
    public Animal() {
        //4,在无参构造调用含参构造
        //this(1);//5,构造方法里,如果出现第一条语句
        this("10");
        System.out.println("无参构造方法");
    }

    public Animal(String a) {
        System.out.println("含参构造");
    }

    public Animal(int a) {
        //3,在含参构造调用无参构造
        this();
        System.out.println("含参构造方法" + a);
    }

    String name = "rose";//成员变量

    public void eat() {
        String name = "jack";//局部变量
        //1,变量使用的就近原则,优先使用局部变量,jack
        System.out.println(name);
        //2,this代表本类对象的一个引用,this的场景1:
        //当局部变量名 和成员变量名相同时,通过this调用成员变量
        System.out.println(this.name);//成员变量rose
    }

}
















