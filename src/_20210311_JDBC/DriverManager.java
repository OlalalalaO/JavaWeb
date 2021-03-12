package _20210311_JDBC;

public class DriverManager {
    /*
    功能
    1.注册驱动
      Class.forName("com.mysql.jdbc.Driver");
      在com.mysql.jdbc.Driver存在静态代码块，加载进内存时便被执行
      mysql5之后可以省略
    2.获取数据库连接
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db4", "root", "root"); 连接数据库
      url指定ip端口和数据库的名称默认3306，本地ip可不写

     */
}
