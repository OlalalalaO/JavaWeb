package _20210311_JDBC;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

//结果集对象，resultSet
public class resultSet {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db4","root","root");
            String sql = "select * from emp.emp";
            stmt = conn.createStatement();
            resultSet = stmt.executeQuery(sql);
            //让光标向下移动
            resultSet.next();
            int id = resultSet.getInt(1);
            String name = resultSet.getString("name");
            System.out.println(id+" "+name);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        }
    }
}
