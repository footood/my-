package cn.tedu.oop;
//���� ��װ-private
//�ܽ�:
//1,ͨ��private�ؼ���,ʵ�ַ�װ,�����Դ�İ�ȫ��(ֻ���ڱ��������)
//2,�����Ա�private��,��Ҫ�ṩpublic��getXxx()��ȡֵ/setXxx()����ֵ
//3,��������private��,��Ҫ�ṩ��ӵķ��ʷ�ʽ
public class Student {
    //TODO Fields--��Ա����/ʵ������
//1,ͨ��private�ؼ���,ʵ�ַ�װ,ֻ���ڱ����з���ʹ��,������ò���.����˰�ȫ��
    private String name;
    private int no;
    private char sex;
    //5,Eclipse�Զ�����get/set
//�Ҽ�source-generate getters and setters-select all-ok
    //3,������ṩ ��ȡ��ʽget()
    public String getName() {
        return name;//����緵��name���Ե�ֵ
    }
    //4,������ṩ���÷�ʽset()
    public void setName(String name) {
        this.name = name;//��name���Ը�ֵ
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }

    //TODO Methods--����/����
//1,ͨ��private�ؼ���,ʵ�ַ�װ,ֻ���ڱ����з���ʹ��,������ò���.����˰�ȫ��
    private void coding() {
        System.out.println("�Ұ�Java");
    }
    public void game() {
//2,��Ϊcoding()����װ��,ֻ���ڱ����з���,������ṩ��ӵķ��ʷ�ʽ
        coding();
        System.out.println("����");
    }
}
