package cn.tedu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: 向双
 * @date: 2021年04月25日 09时55分
 * @description: 注解
 */
public class Test1 {
    @Target({ElementType.TYPE,ElementType.LOCAL_VARIABLE})
    @Retention(RetentionPolicy.CLASS)
    @interface Mapper{
        String local() default " ";
        String value() default " ";

}
    @Mapper(local = "type")
    class AnnotationDemo{
        String name;
        public void show(  int a){

            int age =10;
        }
    }
}
