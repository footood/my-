package cn.tedu.opp;

import org.w3c.dom.ls.LSOutput;

/**
 * @author: xiang shuang
 * @date: 2021��04��17�� 15ʱ57��
 * @description: ���� �̳���Ĺ��췽��
 *�ܽ�:
 * 1,���췽����������:��������new
 * 2,�̳к�,���๹�췽���������super()--��˼�ǻ��Զ����ø�����޲ι���
 * 3,�������û���޲ι���,����,ֻ�ܵ��ø���ĺ��ι���
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
    //1,���췽����,������super(),���Զ����ø���� �޲ε� ���췽����
    //		//3,super�ؼ���,����������˹��췽����,�����ǵ�һ�����
    //		super();
    super(666);//2,�������Ǹ���ĺ��ι��췽��
    System.out.println(2);
}
}


