package _20210311_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ressultSetTra {
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
            while (resultSet.next()){
                int anInt = resultSet.getInt(1);
                String string = resultSet.getString(2);
                System.out.println(anInt);
                System.out.println(string);
            }
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
