package cn.tedu.io;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author: 向双
 * @date: 2021年04月19日 16时48分
 * @description: 提取close()共性代码
 */
public class TOUtils {
    public static void close(Closeable in){
       if(in!=null){
           try {
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    }
}
