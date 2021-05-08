package cn.tedu.opp;

/**
 * @author: xiang shuang
 * @date: 2021年04月19日 08时55分
 * @description:
 */
public class polymorphism {
    public static void main(String[] args) {
        //5.创建父类对象进行测试\
        Animal a = new Animal();
        a.eat();//小动物Animal吃啥都行~~~
        //a.jump();//父类无法使用子类的特有方法
        //6.创建子类对象进行测试
        Cat c = new Cat();
        c.eat();//小猫Cat爱吃小鱼干!!!--调用的是重写以后的功能
        c.jump();
        //8.创建多态对象进行测试
        /**口诀1:父类引用 指向子类对象*/
        /**口诀2:编译(保存)看左边,运行(测试)看右边*/
        Animal a2 = new Cat();
        Animal a3 = new Dog();
        a2.eat();//eat()使用的是父类的声明,但使用的是子类的实现方式
        a3.eat();
        /**多态的出现是为了统一调用标准,向父类看齐
         * 父类提供的功能才能用,子类特有的功能用不了*/
    }
}

//1.创建父类
class Animal {
    //3.创建父类中的普通方法eat()
    public void eat() {
        System.out.println("小动物Animal吃啥都行~~~");
    }
}

//2.创建子类
class Cat extends Animal {
    //4.重写父类中的方法--对父类中的代码功能修改
    //重写:方法签名保持一致(返回值类型 方法名(参数列表) )
    // & 权限修饰符 >= 父类权限修饰符
    public void eat() {
        System.out.println("小猫Cat爱吃小鱼干!!!");
    }
    //7.定义了子类特有的方法
    public void jump() {
        System.out.println("小猫Cat跳的老高啦");
    }
}
class Dog extends Animal {
    public void eat() {
        System.out.println("小狗爱吃肉骨头!!!");
    }
}
