package cn.tedu;

import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.Source;
import java.sql.*;
import java.util.Scanner;

public class TestJdbc {
    public static void main(String[] args) throws Exception {
        //method();//普通方式
        //method2();//暴露sql注入问题
        method3();//解决sql注入问题
    }

    //解决sql注入问题
    private static void method3() throws Exception {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/jdbctest?characterEncoding=utf8";
//        String name = "root";
//        String pwd = "root";
//        Connection conn = DriverManager.getConnection(url, name, pwd);
        //Statement st = conn.createStatement();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCutils.getConnection();
            String a = new Scanner(System.in).nextLine();
            String b = new Scanner(System.in).nextLine();
            String sql = "select * from user where name=? and pwd=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, a);
            ps.setString(2, b);
            rs = ps.executeQuery();
            while (rs.next()) {
                for (int i = 1; i <= 3; i++) {
                    System.out.println(rs.getString(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCutils.close(rs,ps,conn);
            }
        }


    //暴露sql注入问题,
    private static void method2() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jdbctest";
        String name = "root";
        String pwd = "root";
        Connection conn = DriverManager.getConnection(url, name, pwd);
        Statement st = conn.createStatement();
        String a = new Scanner(System.in).nextLine();
        String b = new Scanner(System.in).nextLine();
        String sql = "select * from user where name='" + a + "' and pwd='" + b + "'";
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(rs.getString(i));
            }
        }
        rs.close();
        st.close();
        conn.close();
    }

    //使用JDBC查询user表的数据
    private static void method() throws Exception {
        //1,注册驱动(jar包)
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2,连接数据库
        //getConnection(1,2,3)-1是要连接哪个数据-2是用户名-3是密码
        Connection con = DriverManager.getConnection(
//                "协议//服务器的名字:数据库的端口号/数据库名",
//                "jdbc:mysql://localhost:3306/jdbctest",
                "jdbc:mysql:///jdbctest",
                //url简写(使用本机使用默认的端口号)
                "root", "root");
        //3,获取传输器Statement
        Statement st = con.createStatement();
        //4,执行SQL
        String sql = "select * from user where name='jack' and pwd='123'";
        ResultSet rs = st.executeQuery(sql);
        //5,解析结果集
        while (rs.next()) { //next()判断有数据吗
            //有数据就一个一个解析id/name/pwd
            String id = rs.getString(1);//按索引查
            String name = rs.getString(2);//按索引查
            String pwd = rs.getString(3);//按索引查
            System.out.println(id + "\r\n" + name + pwd);
        }
        //6,释放资源
        rs.close();
        st.close();
        con.close();
    }
}
