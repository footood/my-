package cn.tedu.inner;

/**
 * @author: 向双
 * @date: 2021年04月26日 17时24分
 * @description:
 */
public class Test6 {
    public static void main(String[] args) {
        W w =new W(){
          @Override
          public void f(){
              System.out.println("◆◇◎●○★☆№§■△▲※→←↑↓¤＠＆＃");
          }

            @Override
            public void t() {
                System.out.println("筽");
            }
        };
        w.f();
        w.t();
    }
}
abstract class W{
    public void f(){
        System.out.println(987);
    }
    abstract public void t();
}