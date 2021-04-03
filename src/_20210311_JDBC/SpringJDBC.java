package _20210311_JDBC;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class SpringJDBC {
    //1.导入jar包
    public static void main(String[] args) {
        //创建jdbctemplate
        JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());  //获取连接池
        //调用方法
        //String sql = "update user1 set password = '1176328868' where username = ?";
        //int count = template.update(sql, "张三");//替换问号
        //System.out.println(count);

        //添加一条
//        String addSql = "insert into user1 values(?,?)";
//        int update = template.update(addSql, "赵子轩", "qwe");
//        System.out.println(update);

        //删除
//        String deleteAddSql = "delete from user1 where username = ?";
//        int 赵子轩 = template.update(deleteAddSql, "赵子轩");
//        System.out.println(赵子轩);

        //查询并封装
//        String searchSql = "select *from user1 where username = ?";
//        Map<String, Object> map = template.queryForMap(searchSql, "李四");  //列名为key，内容为values
//        System.out.println(map);

        //查询并封装为list
//        String searchSql = "select *from user1";
//        List<Map<String, Object>> maps = template.queryForList(searchSql);
//        System.out.println(maps);

        //查询封装为JavaBean-自己实现
/*        String searchSql = "select *from user1";
        List<user1> query = template.query(searchSql, new RowMapper<user1>() {

            @Override
            public user1 mapRow(ResultSet resultSet, int i) throws SQLException {
                user1 user = new user1();

                user.setName(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        });
        for (user1 user1 : query) {
            System.out.println(user1);
        }

    }*/
        //javabean自己实现
        String searchSql = "select *from user1";
        List<user1> query = template.query(searchSql, new BeanPropertyRowMapper<>(user1.class));  //javabean的成员变量必须与sql中的数据符合，构造方法也必须齐全
        for (user1 user1 : query) {
            System.out.println(user1);
        }

    }

}
