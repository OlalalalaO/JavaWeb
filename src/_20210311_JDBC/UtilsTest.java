package _20210311_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UtilsTest {
    public static void main(String[] args) throws SQLException {
        /**
         * 完成添加操作
         */
        //1，获取链接
        Connection conn = DruidUtils.getConnection();
        String sql = "insert into user1 values(?,?)";

        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,"李");
        ps.setString(2,"18");
        int i = ps.executeUpdate();
        System.out.println(i);
        DruidUtils.close(null,ps,conn);
    }
}
