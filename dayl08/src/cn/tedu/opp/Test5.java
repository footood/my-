package cn.tedu.opp;

/**
 * @author: xiang shuang
 * @date: 2021��04��17�� 16ʱ38��
 * @description: ���� static�ؼ���
 */
public class Test5 {
    public static void main(String[] args){
        //TODO �����������
        Person p = new Person();
        p.eat();
        System.out.println(p.age);
        p.sleep();
        System.out.println(p.name);
        //1,static ����Դ,����ͨ���������+��������
        Person.sleep();
        System.out.println(Person.name);
        Person p1 = new Person();
        p1.name="����";
        Person p2 = new Person();
        System.out.println(p2.name);
        Person p3 = new Person();
        System.out.println(p3.name);
        Person p4 = new Person();
        System.out.println(p4.name);


    }

}
class Person{
    //TODO ��ͨ��Դ
    int age = 10;
    public void eat(){
        //TODO 4.2,��ͨ��Դ���Ե���������Դ(��ͨ��/��̬��)
        System.out.println(1);
        System.out.println(name);
    }
    //TODO ��̬��Դ
    //1,static �������� ��Ա�����ͷ���
    //2,static��Դ�����ڶ���ļ���
    //3,static��Դ�ǹ����,����ֱ�ӱ���������
    static String name = "tony";
    static public void sleep(){
        //TODO 4,��̬��Դ������ͨ��Դ?--����ֱ�ӵ���,�������γ�static��
        //System.out.println(name);
        //TODO 4.1,��̬��Դ���þ�̬��Դ?--����
        System.out.println(name);
        System.out.println(1);
    }


}








