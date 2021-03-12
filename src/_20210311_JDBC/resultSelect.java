package _20210311_JDBC;

import emp.emp;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class resultSelect {
    public static void main(String[] args) throws SQLException {
        List<emp> list = new resultSelect().findAll();
        System.out.println(list);
    }
    /**
     * 查询所有emp对象
     * @return
     */
    public List<emp> findAll() throws SQLException {
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        emp ee = null;
        List<emp> empList = null;
        //注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db4", "root", "root");

            String sql = "select * from emp";

            empList= new ArrayList<>();
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);
            resultSet.next();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                int salary = resultSet.getInt("salary");
                Date join_date = resultSet.getDate("join_date");
                String dep_id = resultSet.getString("dept_id");
                ee = new emp(id,name,gender,salary,join_date,dep_id);
                empList.add(ee);

            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (statement != null) {
                statement.close();
            }
            if (conn != null) {
                conn.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        }


        return empList;
    }

}
