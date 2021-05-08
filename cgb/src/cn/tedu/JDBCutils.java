package cn.tedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author: 向双
 * @date: 2021年05月08日 11时34分
 * @description:
 */
public class JDBCutils {


public static Connection getConnection() throws Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/jdbctest?characterEncoding=utf8";
    String name = "root";
    String pwd = "root";
    Connection conn = DriverManager.getConnection(url, name, pwd);
    return conn;
    }

    /**
     * 关闭资源
     * @param rs 结果集
     * @param ps 传输器
     * @param conn 连接
     */
    public static void close(ResultSet rs, PreparedStatement ps,Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                rs = null;
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                ps = null;
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                conn = null;
            }
        }
    }
}
