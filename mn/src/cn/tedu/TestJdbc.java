package cn.tedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//测试 JDBC
//JDBC用来把java程序和数据库连接起来,目的是通过java代码操作数据库
public class TestJdbc {
    public static void main(String[] args) throws Exception {
        method();//普通方式
    }
    //使用JDBC查询user表的数据
    private static void method() throws Exception {
        //1,注册驱动(jar包)
        Class.forName("com.mysql.jdbc.Driver");
        //2,连接数据库
        //getConnection(1,2,3)-1是要连接哪个数据-2是用户名-3是密码
        Connection con = DriverManager.getConnection(
//                "协议//服务器的名字:数据库的端口号/数据库名",
//                "jdbc:mysql://localhost:3306/jdbctest",
                "jdbc:mysql:///jdbctest",
                //url简写(使用本机使用默认的端口号)
                "root","root");
        //3,获取传输器Statement
        Statement st = con.createStatement();
        //4,执行SQL
        String sql = "select * from user where name='jack' and pwd='123'";
        ResultSet rs = st.executeQuery(sql);
        //5,解析结果集
        while(rs.next()){ //next()判断有数据吗
            //有数据就一个一个解析id/name/pwd
            String id = rs.getString(1);//按索引查
            String name = rs.getString(2);//按索引查
            String pwd = rs.getString(3);//按索引查
            System.out.println(id+name+pwd);
        }
        //6,释放资源
        rs.close();
        st.close();
        con.close();
    }
}
