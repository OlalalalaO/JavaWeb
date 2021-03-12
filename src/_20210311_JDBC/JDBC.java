package _20210311_JDBC;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) throws Exception {
        //1.导入驱动jar
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取驱动连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4", "root", "root");
        //4.定义sql语句
        String sql = "update emp.emp set salary = 500 where id = 6";
        //5,获取执行sql的对象
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);

        System.out.println(count);

        //释放资源
        stmt.close();
        conn.close();
    }
}
