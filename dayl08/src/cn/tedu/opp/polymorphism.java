package cn.tedu.opp;

/**
 * @author: xiang shuang
 * @date: 2021��04��19�� 08ʱ55��
 * @description:
 */
public class polymorphism {
    public static void main(String[] args) {
        //5.�������������в���\
        Animal a = new Animal();
        a.eat();//С����Animal��ɶ����~~~
        //a.jump();//�����޷�ʹ����������з���
        //6.�������������в���
        Cat c = new Cat();
        c.eat();//СèCat����С���!!!--���õ�����д�Ժ�Ĺ���
        c.jump();
        //8.������̬������в���
        /**�ھ�1:�������� ָ���������*/
        /**�ھ�2:����(����)�����,����(����)���ұ�*/
        Animal a2 = new Cat();
        Animal a3 = new Dog();
        a2.eat();//eat()ʹ�õ��Ǹ��������,��ʹ�õ��������ʵ�ַ�ʽ
        a3.eat();
        /**��̬�ĳ�����Ϊ��ͳһ���ñ�׼,���࿴��
         * �����ṩ�Ĺ��ܲ�����,�������еĹ����ò���*/
    }
}

//1.��������
class Animal {
    //3.���������е���ͨ����eat()
    public void eat() {
        System.out.println("С����Animal��ɶ����~~~");
    }
}

//2.��������
class Cat extends Animal {
    //4.��д�����еķ���--�Ը����еĴ��빦���޸�
    //��д:����ǩ������һ��(����ֵ���� ������(�����б�) )
    // & Ȩ�����η� >= ����Ȩ�����η�
    public void eat() {
        System.out.println("СèCat����С���!!!");
    }
    //7.�������������еķ���
    public void jump() {
        System.out.println("СèCat�����ϸ���");
    }
}
class Dog extends Animal {
    public void eat() {
        System.out.println("С���������ͷ!!!");
    }
}
