package _20210311_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//添加一条记录
public class JDBC_new {

    public static void main(String[] args) throws SQLException {
        Statement statement = null;
        Connection connection = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql
            String sql = "insert into emp.emp values(8,'王五','男',6000,null,null)";
            //获取执行sql
            connection = DriverManager.getConnection("jdbc:mysql:///db4", "root", "root");
            statement = connection.createStatement();
            int i = statement.executeUpdate(sql);
            System.out.println(i);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (statement!=null) {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (connection!=null)connection.close();


        }
    }
}
