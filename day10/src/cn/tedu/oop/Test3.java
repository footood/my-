package cn.tedu.oop;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author: 向双
 * @date: 2021年04月19日 20时15分
 * @description:
 */
public class Test3 {
    public static void main(String[] args) {

    }
}
interface A1{
    void save();
}
interface A2{
    void get(int id);
    interface A3 extends A1,A2{
        void del();
    }
    class Impl extends Object implements A1,A2{
        @Override
        public void get(int id){ }
        public void save(){}
    }
    class AImpl implements A1,A2,A3{
        @Override
        public void del(){}
        public void get(int id){}
        public void save(){}
    }

}