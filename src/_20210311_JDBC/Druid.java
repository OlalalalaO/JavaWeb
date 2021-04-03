package _20210311_JDBC;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class Druid {
    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.定义配置文件
        //3.加载配置文件
        Properties pro = new Properties();
        InputStream is = Druid.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
        //创建连接对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);

        //获取连接对象
        Connection connection = dataSource.getConnection();

        System.out.println(connection);

    }
}
