package cn.tedu.oop;

/**
 * @author: xiang shuang
 * @date: 2021��04��17�� 11ʱ18��
 * @description:
 *
 * ���� ���췽��
 * �ܽ�:
 * 1,����:��������new+���Ը���Ա������ֵ
 * 2,�﷨:���η� ����([�����б�]){������}
 * 3,���췽��ʲôʱ�򱻴���?--newʱ
 * 4,���췽����������һ���޲εĹ��췽��,���ǵ�ֻ�ṩ���ι��췽��ʱ,�޲ι����û����
 * 5,Ϊ�����new�ķ�������,�����ṩ���صĹ��췽��
 * 6,����ѹ��췽��private,�Ǿ�ֻ���ڱ������,����޷�new
 */
public class Test2 {
    public static void main(String[] args) {
        //3,��������/ʵ���� ���Զ����� ���췽��
        new Person();//�Զ�����String�Ĺ��췽��
        new Person("����ӱ");//�Զ�����String�Ĺ��췽��
        new Person("jack", 100);//�Զ�����String��int �Ĺ��췽��
    }
    //TODO ���췽��--���η� ����([�����б�]){������}
    static class Person{
        //1,�޲εĹ��칹�췽��,Ĭ�Ͼʹ��ڵ�,�����ص�(ǰ����:����ֻ�ṩ���ι���)
        public Person(){}
        //2,���췽��ʱһ������ķ���,���Է�������
        //����:��һ������ķ�������ͬ,���ǲ����б�ͬ ����--���
        private String s;
        public Person(String name){
            s = name;//3,���ù��췽��,����Ա������ֵ
            System.out.println(name);
        }
        public Person(int age){
            System.out.println(age);
        }
        public Person(String name,int age){
            System.out.println(name+age);
        }

    }






















}
