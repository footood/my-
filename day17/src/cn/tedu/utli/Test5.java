package cn.tedu.utli;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: 向双
 * @date: 2021年04月23日 17时31分
 * @description:
 */
public class Test5 {
    public static void main(String[] args) {

    }
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
@interface Controller{

}
@Controller
class H{
    String name;
    public void show(){
        System.out.println(1);
    }
}