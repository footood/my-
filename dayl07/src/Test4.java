/**
 * @author: xiang shuang
 * @date: 2021��04��17�� 12ʱ51��
 * @description: ����thic�ؼ���
 * �ܽ�:
 * 1,this����������һ������,�൱��this���㴴��һ������Ķ���
 * 2,this���Ե���ͬһ�������������Դ(��Ա����/����/���췽��)
 * 3,thisʹ�õĵ�һ��������:��������ͬ���ĳ�Ա�����;ֲ�����,this���õ�һ���ǳ�Ա����
 * 4,thisʹ�õĵڶ���������:�����ڹ��췽���以�����
 * λ�ñ����ǵ�һ�����+�����γ���������ѭ��������
 */
public class Test4 {
    public static void main(String[] args){
        new Animal();
    }
}
class Animal {
    public Animal() {
        //4,���޲ι�����ú��ι���
        //this(1);//5,���췽����,������ֵ�һ�����
        this("10");
        System.out.println("�޲ι��췽��");
    }

    public Animal(String a) {
        System.out.println("���ι���");
    }

    public Animal(int a) {
        //3,�ں��ι�������޲ι���
        this();
        System.out.println("���ι��췽��" + a);
    }

    String name = "rose";//��Ա����

    public void eat() {
        String name = "jack";//�ֲ�����
        //1,����ʹ�õľͽ�ԭ��,����ʹ�þֲ�����,jack
        System.out.println(name);
        //2,this����������һ������,this�ĳ���1:
        //���ֲ������� �ͳ�Ա��������ͬʱ,ͨ��this���ó�Ա����
        System.out.println(this.name);//��Ա����rose
    }

}
















