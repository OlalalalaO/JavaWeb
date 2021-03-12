package _20210311_JDBC;

public class Connection {
    /*
    功能：
        1.获取执行sql的对象
            createStatement
            prepareStatement
        2.管理事务
            开启事务 setAutoCommit();参数设置为false，开启
            提交事务 commit()提交事务
            回滚事务 rollback()回滚事务
        3.statement 执行sql的对象
            可以执行任意sql
            executeUpdate 执行dml语句，返回值为影响的行数
            executeQuery 执行dql（select）语句
            resultSet executeQuery 执行sql语句
     */
}
