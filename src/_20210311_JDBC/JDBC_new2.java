package _20210311_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// 更新操作
public class JDBC_new2 {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db4", "root", "root");
            String sql = "update emp.emp set salary = 1000 where id = 8";

            statement = conn.createStatement();
            int i = statement.executeUpdate(sql);
            System.out.println(i);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if(conn!=null)conn.close();
            if(statement!=null)statement.close();
        }
    }
}
